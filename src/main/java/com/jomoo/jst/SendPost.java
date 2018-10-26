package com.jomoo.jst;

import com.google.gson.Gson;
import org.joda.time.DateTime;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.math.BigInteger;
import java.net.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;


/*
AccessKeyId： 应用ID
    例：TOPTOSBCP

SignatureNonce：唯一字符串，使用UUID()生成即可
    例：45e25e9b-0a6f-4070-8c85-2956eda1b466

Timestamp：  当前时间
    例：2018-10-18 13:36:05

Signature：  生成的签名结果值
    例：base64_encode( md5 ( AccessSecret & AccessKeyId & SignatureNonce & Timestamp) )

Topic：   天猫消息推送标题
    例：tmall_fuwu_WorkcardInfo

JsonStr：  天猫反馈内容

Signature说明：

//约定的私钥，常量
$AccessSecret = "AccessSecret=ABCDEFGHIJKLMNOPQRSTUVWXYZ";

$orgSign = $AccessSecret . "&AccessKeyId=TOPTOSBCP&SignatureNonce=45e25e9b-0a6f-4070-8c85-2956eda1b466&Timestamp=2018-10-18 13:36:05";

$Signature = base64_encode( md5 ( $orgSign ) );
 */

public class SendPost {
    private static String AccessSecret = "f379da9b9dc74ae3";
    private static String AccessKeyId = "TOPTOSBCP";

    public static void main(String argv[]) {
        String SignatureNonce = UUID.randomUUID().toString();
        String Timestamp = new DateTime().toString("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);
        String Topic = "tmall_fuwu_WorkcardInfo";
        String JsonStr = "{\"result\":{\"receiveTimeNumber\":1540449464000,\"parentBizOrderId\":231395783928043278,\"sellerNick\":\"三星智能锁旗舰店\",\"buyerMail\":\"1368299287@qq.com\",\"auctionId\":556821142815,\"buyerLocation\":500103003,\"actualTotalFee\":22000,\"payTimeNumber\":1540396724000,\"needReturnGoods\":0,\"auctionSkuProperties\":\"{\\\"@type\\\":\\\"java.util.HashMap\\\",\\\"父类目\\\":\\\"锁具\\\",\\\"类目\\\":\\\"电子门锁\\\"}\",\"serviceOrderId\":231395783930043278,\"auctionPrice\":318000,\"category\":\"50021306\",\"shopName\":\"三星智能锁旗舰店\",\"receiveTime\":\"2018-10-25 14:37:44\",\"modelNumber\":\"728\",\"taskType\":0,\"serviceCount\":1,\"xiaoerIntervention\":false,\"serviceName\":\"电子门锁安装\",\"sellerPunish\":false,\"taskStatus\":1,\"sellerId\":3363576213,\"excludeTest\":false,\"brand\":\"Samsung/三星\",\"sellerMobile\":\"18918855785\",\"payTime\":\"2018-10-24 23:58:44\",\"auctionName\":\"三星 指纹锁密码锁家用防盗门锁智能电子锁 推拉手机开门 DP728\",\"buyerNick\":\"jiaoweifeng6\",\"tpName\":\"典越电子商务公司\",\"categoryId\":50021306,\"taskMemo\":\"上门安装\",\"buyerMobile\":\"18725780178\",\"tpId\":2468433189,\"serviceCode\":\"电子门锁安装\",\"bizOrderId\":231395783929043278,\"reasonId\":0,\"buyerAddress\":\"重庆 重庆 渝中 解放碑 民权路88号R2栋45-9号\",\"solution\":0,\"id\":78407065,\"orderRelationId\":-1,\"name\":\"电子门锁安装\",\"acceptType\":0,\"buyerId\":850047832,\"buyerName\":\"焦渭峰\",\"buyerZipCode\":\"000000\",\"attributes\":{\"itemSkuProperty\":\"饰面颜色:728香槟金内开+【无忧安装】\",\"lbxNo\":\"LP00114564887525\",\"service_pattern\":\"platform\",\"servPrice\":\"22000\",\"servSkuName\":\"\"},\"buyAmount\":1}}";

        SendPost sendPost = new SendPost();
        try {
            sendPost.setMessage(SignatureNonce, Timestamp, Topic, JsonStr);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public void setMessage(String SignatureNonce, String Timestamp, String Topic, String JsonStr) throws UnsupportedEncodingException {
        Gson gson = new Gson();
        String param1 = "AccessSecret=" + AccessSecret + "&AccessKeyId=" + AccessKeyId + "&SignatureNonce=" + SignatureNonce + "&Timestamp=" + Timestamp;
        String Signature = null;
        try {
            Signature = getEndcodeString(param1);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        BASE64Encoder base64en = new BASE64Encoder();
        Signature = base64en.encode(Signature.getBytes());

        //String param2 = "AccessKeyId=" + AccessKeyId + "&SignatureNonce=" + SignatureNonce + "&Timestamp=" + Timestamp + "&Signature=" + Signature + "&Topic=" + Topic + "&JsonStr" + JsonStr;

//        Map<String, String> params = new HashMap<String, String>();
//        params.put("AccessKeyId", AccessKeyId);
//        params.put("SignatureNonce", SignatureNonce);
//        params.put("Timestamp", Timestamp);
//        params.put("Signature", Signature);
//        params.put("Topic", Topic);
//        params.put("JsonStr", URLEncoder.encode(JsonStr, "utf-8"));
//
//        sendPostMessage("http://218.5.155.206:8099/", params, "utf-8");

        //f1
        DataObjectOrderInfo dataObject = new DataObjectOrderInfo();
        dataObject = dataObject.jsonToDataOrderInfo(JsonStr);

        //f2
        OrderInfo orderInfo = gson.fromJson(JsonStr, OrderInfo.class);


        Map<String, Object> params = new HashMap<String, Object>();
        params.put("AccessKeyId", AccessKeyId);
        params.put("SignatureNonce", SignatureNonce);
        params.put("Timestamp", Timestamp);
        params.put("Signature", Signature);
        params.put("Topic", Topic);
        //params.put("JsonStr", JsonStr);
        params.put("JsonStr", dataObject);
//        params.put("JsonStr", orderInfo);

        String bodyString = gson.toJson(params);
        System.out.println(bodyString);



        //sendPostMessage("http://218.5.155.206:8099/topevent?topic=" + Topic, params, "utf-8");
//        sendPostMessage("http://218.5.155.206:7777/topevent?topic=" + Topic, bodyString, "utf-8");
//        sendPostMessage("http://218.5.155.206:7777/topevent?topic=" + Topic, dataObject, "utf-8");
//        sendPostMessage("http://demo.baogongpo.cn/TOP/v1/demo.php", bodyString, "utf-8");
//        sendPostMessage("http://demo.baogongpo.cn/test/post.php", bodyString, "utf-8");

        //doJsonPost("http://218.5.155.206:7777/topevent?topic=" + Topic, bodyString);
        //doJsonPost("http://demo.baogongpo.cn/test/post.php", bodyString);
    }


    /*
     * params 填写的URL的参数 encode 字节编码
     */
    public String sendPostMessage(String strUrl, Map<String, String> params, String encode) {

        URL url = null;
        try {
            url = new URL(strUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        StringBuffer stringBuffer = new StringBuffer("topevent?topic=" + params.get("Topic"));

        if (params != null && !params.isEmpty()) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                try {
                    stringBuffer
                            .append(entry.getKey())
                            .append("=")
                            .append(URLEncoder.encode(entry.getValue(), encode))
                            .append("&");

                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            // 删掉最后一个 & 字符
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            System.out.println("body:" + stringBuffer.toString());

            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url
                        .openConnection();
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setDoInput(true);// 从服务器获取数据
                httpURLConnection.setDoOutput(true);// 向服务器写入数据

                // 获得上传信息的字节大小及长度
                byte[] mydata = stringBuffer.toString().getBytes();
                // 设置请求体的类型
                //httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                httpURLConnection.setRequestProperty("Content-Lenth", String.valueOf(mydata.length));

                // 获得输出流，向服务器输出数据
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(mydata);

                // 获得服务器响应的结果和状态码
                int responseCode = httpURLConnection.getResponseCode();
                System.out.println(responseCode);
                if (responseCode == 200) {
                    // 获得输入流，从服务器端获得数据
                    InputStream inputStream = (InputStream) httpURLConnection
                            .getInputStream();
                    System.out.println(changeInputStream(inputStream, encode));
                        return (changeInputStream(inputStream, encode));
                }

                httpURLConnection.disconnect();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return "";
    }

    public String sendPostMessage(String strUrl, String paramString, String encode) {

        URL url = null;
        try {
            url = new URL(strUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (paramString != null) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url
                        .openConnection();
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setDoInput(true);// 从服务器获取数据
                httpURLConnection.setDoOutput(true);// 向服务器写入数据

                // 获得上传信息的字节大小及长度
                byte[] mydata = paramString.getBytes();
                // 设置请求体的类型
                //httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                httpURLConnection.setRequestProperty("Content-Lenth", String.valueOf(mydata.length));

                // 获得输出流，向服务器输出数据
                OutputStream outputStream = (OutputStream) httpURLConnection
                        .getOutputStream();
                outputStream.write(mydata);

                // 获得服务器响应的结果和状态码
                int responseCode = httpURLConnection.getResponseCode();
                System.out.println(responseCode);
                if (responseCode == 200) {
                    // 获得输入流，从服务器端获得数据
                    InputStream inputStream = (InputStream) httpURLConnection
                            .getInputStream();
                    System.out.println(changeInputStream(inputStream, encode));
                    return (changeInputStream(inputStream, encode));
                }

                httpURLConnection.disconnect();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "";
    }


    /*
     * // 把从输入流InputStream按指定编码格式encode变成字符串String
     */
    public String changeInputStream(InputStream inputStream,
                                    String encode) {

        // ByteArrayOutputStream 一般叫做内存流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] data = new byte[1024];
        int len = 0;
        String result = "";
        if (inputStream != null) {

            try {
                while ((len = inputStream.read(data)) != -1) {
                    byteArrayOutputStream.write(data, 0, len);

                }
                result = new String(byteArrayOutputStream.toByteArray(), encode);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return result;
    }


    /**
     * 对字符串md5加密
     *
     * @param str
     * @return
     */
    public static String getEndcodeString(String str) throws NoSuchAlgorithmException {
        // 生成一个MD5加密计算摘要
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 计算md5函数
        md.update(str.getBytes());
        // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
        // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
        return new BigInteger(1, md.digest()).toString(16);
    }

    public String doJsonPost(String urlPath, String Json) {
        String result = "";
        BufferedReader reader = null;
        try {
            URL url = new URL(urlPath);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Charset", "UTF-8");
            // 设置文件类型:
            conn.setRequestProperty("Content-Type","application/json; charset=UTF-8");
            // 设置接收类型否则返回415错误
            //conn.setRequestProperty("accept","*/*")此处为暴力方法设置接受所有类型，以此来防范返回415;
            conn.setRequestProperty("accept","application/json");
            // 往服务器里面发送数据
            if (Json != null) {
                byte[] writebytes = Json.getBytes();
                // 设置文件长度
                conn.setRequestProperty("Content-Length", String.valueOf(writebytes.length));
                OutputStream outwritestream = conn.getOutputStream();
                outwritestream.write(Json.getBytes());
                outwritestream.flush();
                outwritestream.close();
            }
            System.out.println(conn.getResponseCode());
            if (conn.getResponseCode() == 200) {
                reader = new BufferedReader(
                        new InputStreamReader(conn.getInputStream()));
                result = reader.readLine();
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

}
