package com.jomoo.jst;

import com.google.gson.Gson;
import com.jomoo.jst.DataObject.AnomalyInfo;
import com.jomoo.jst.DataObject.OrderInfo;
import com.jomoo.jst.DataObject.StatusUpdate;
import org.apache.log4j.Logger;
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
    private static Logger logger = Logger.getLogger(SendPost.class);
    public static void main(String argv[]) {

        WorkcardInfo();
//        AnomalyRecourse();
//        WorkcardStatusUpdate();
    }

    private static void WorkcardInfo() {
        Gson gson = new Gson();

        String SignatureNonce = UUID.randomUUID().toString();
        String Timestamp = new DateTime().toString("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);

        String Topic = "tmall_fuwu_WorkcardInfo";
   //     String JsonStr = "{\"result\":{\"receiveTimeNumber\":1542629200000,\"parentBizOrderId\":250752076685604100,\"sellerNick\":\"b商家测试帐号200\",\"buyerMail\":\"b2c-test785@service.aliyun.com\",\"auctionId\":571994794751,\"buyerLocation\":350203010,\"actualTotalFee\":5500,\"payTimeNumber\":1542628847000,\"needReturnGoods\":0,\"auctionSkuProperties\":\"{\\\"@type\\\":\\\"java.util.HashMap\\\",\\\"父类目\\\":\\\"坐便器盖板\\\",\\\"类目\\\":\\\"智能坐便盖板\\\"}\",\"serviceOrderId\":250752076688604100,\"auctionPrice\":1,\"category\":\"50020034\",\"shopName\":\"b商家测试帐号200\",\"receiveTime\":\"2018-11-19 20:06:40\",\"modelNumber\":\"曼薇测试\",\"taskType\":0,\"serviceCount\":1,\"xiaoerIntervention\":false,\"serviceName\":\"卫浴小件安装\",\"sellerPunish\":false,\"taskStatus\":1,\"sellerId\":3692189295,\"excludeTest\":false,\"brand\":\"天猫测试品牌11\",\"sellerMobile\":\"\",\"payTime\":\"2018-11-19 20:00:47\",\"auctionName\":\"曼薇测试请不要拍下\",\"buyerNick\":\"c测试账号785\",\"tpName\":\"九牧厨卫官方旗舰店:店铺负责\",\"categoryId\":50020034,\"taskMemo\":\"上门安装\",\"buyerMobile\":\"18350243375\",\"tpId\":2191428291,\"serviceCode\":\"卫浴小件安装\",\"bizOrderId\":250752076686604100,\"reasonId\":0,\"buyerAddress\":\"福建 厦门 思明 莲前 福建省 厦门市 思明区 莲前街道前埔路506-508号国金广场B栋10楼\",\"solution\":0,\"id\":87195554,\"orderRelationId\":-1,\"name\":\"卫浴小件安装\",\"acceptType\":0,\"buyerId\":2201600041,\"buyerName\":\"肖先生\",\"buyerZipCode\":\"222222\",\"attributes\":{\"itemSkuProperty\":\"颜色分类:军绿色\",\"lbxNo\":\"LP00114815679612\",\"service_pattern\":\"platform\",\"servPrice\":\"5500\",\"servSkuName\":\"\"},\"buyAmount\":1}}";
        String JsonStr = " {\"result\":{\"receiveTimeNumber\":1545196503000,\"parentBizOrderId\":256341063077271494,\"sellerNick\":\"九牧官方旗舰店\",\"buyerMail\":\"\",\"auctionId\":45423571839,\"buyerLocation\":350212001,\"actualTotalFee\":9000,\"payTimeNumber\":1545177930000,\"needReturnGoods\":0,\"auctionSkuProperties\":\"{\\\"@type\\\":\\\"java.util.HashMap\\\",\\\"父类目\\\":\\\"晾衣架/晾衣杆\\\",\\\"类目\\\":\\\"伸缩晾衣架\\\"}\",\"sellerPhone\":\"400-4001919999\",\"serviceOrderId\":256341063079271494,\"auctionPrice\":36900,\"category\":\"50020968\",\"shopName\":\"九牧官方旗舰店\",\"receiveTime\":\"2018-12-19 13:15:03\",\"modelNumber\":\"LM202\",\"taskType\":0,\"serviceCount\":1,\"xiaoerIntervention\":false,\"serviceName\":\"晾衣架安装\",\"sellerPunish\":false,\"taskStatus\":1,\"sellerId\":667286523,\"excludeTest\":false,\"brand\":\"JOMOO/九牧\",\"sellerMobile\":\"18859969363\",\"payTime\":\"2018-12-19 08:05:30\",\"auctionName\":\"JOMOO九牧卫浴手摇式晾衣杆晾衣架合金材质LM202/LM103\",\"buyerNick\":\"楚爷小乐\",\"tpName\":\"九牧厨卫官方旗舰店:店铺负责\",\"categoryId\":50020968,\"taskMemo\":\"上门安装\",\"buyerMobile\":\"18350277703\",\"tpId\":2191428291,\"serviceCode\":\"晾衣架安装\",\"bizOrderId\":256341063078271494,\"reasonId\":0,\"buyerAddress\":\"福建 厦门 同安 五显 禹州香溪里7地块，4#楼，2605。(欢兔旅行电梯口)\",\"solution\":0,\"id\":92209297,\"orderRelationId\":-1,\"name\":\"晾衣架安装\",\"acceptType\":0,\"buyerId\":2697279414,\"buyerName\":\"乐发楚\",\"buyerZipCode\":\"000000\",\"attributes\":{\"itemOuterId\":\"LM\",\"itemSkuProperty\":\"颜色分类:LM103-754\",\"lbxNo\":\"LP00121104994547\",\"service_pattern\":\"platform\",\"servPrice\":\"9000\",\"servSkuName\":\"\"},\"buyAmount\":1}}";

        SendPost sendPost = new SendPost();
        try {
            OrderInfo orderInfo = gson.fromJson(JsonStr, OrderInfo.class);
            sendPost.setMessageObj(SignatureNonce, Timestamp, Topic, orderInfo);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    private static void AnomalyRecourse() {
        Gson gson = new Gson();

        String SignatureNonce = UUID.randomUUID().toString();
        String Timestamp = new DateTime().toString("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);

        String Topic = "tmall_fuwu_AnomalyRecourse";
        String JsonStr = "{\"result\":{\"receiveTimeNumber\":1545121999000,\"parentBizOrderId\":299988898141070819,\"sellerNick\":\"九牧厨卫官方旗舰店\",\"buyerMail\":\"\",\"auctionId\":556878435528,\"buyerLocation\":520302102,\"actualTotalFee\":6000,\"payTimeNumber\":1545106631000,\"needReturnGoods\":0,\"auctionSkuProperties\":\"{\\\"@type\\\":\\\"java.util.HashMap\\\",\\\"父类目\\\":\\\"坐便器\\\",\\\"类目\\\":\\\"普通坐便器\\\"}\",\"sellerPhone\":\"0592-4001919999\",\"serviceOrderId\":299988898143070819,\"auctionPrice\":89900,\"category\":\"50003558\",\"shopName\":\"九牧厨卫官方旗舰店\",\"receiveTime\":\"2018-12-18 16:33:19\",\"modelNumber\":\"11173\",\"taskType\":0,\"serviceCount\":1,\"xiaoerIntervention\":false,\"serviceName\":\"卫浴大件安装\",\"sellerPunish\":false,\"taskStatus\":1,\"sellerId\":2191428291,\"excludeTest\":false,\"brand\":\"JOMOO/九牧\",\"sellerMobile\":\"18859969566\",\"payTime\":\"2018-12-18 12:17:11\",\"auctionName\":\"jomoo九牧马桶抽水马桶家用陶瓷虹吸式卫生间成人防臭坐便器马桶\",\"buyerNick\":\"曾戈威\",\"tpName\":\"九牧厨卫官方旗舰店:店铺负责\",\"categoryId\":50003558,\"taskMemo\":\"上门安装\",\"buyerMobile\":\"18685260302\",\"tpId\":2191428291,\"serviceCode\":\"卫浴大件安装\",\"bizOrderId\":299988898142070819,\"reasonId\":0,\"buyerAddress\":\"贵州省 遵义市 红花岗区 南关镇 南关镇全心路南秀家园1期六栋一单元18楼4号房\",\"solution\":0,\"id\":92159142,\"orderRelationId\":-1,\"name\":\"卫浴大件安装\",\"acceptType\":0,\"buyerId\":3466071908,\"buyerName\":\"曾戈威\",\"buyerZipCode\":\"563000\",\"attributes\":{\"itemOuterId\":\"11173\",\"itemSkuProperty\":\"颜色分类:305/400坑距选此项;最小坑距:400mm\",\"lbxNo\":\"LP00121026095817\",\"service_pattern\":\"platform\",\"servPrice\":\"6000\",\"servSkuName\":\"\"},\"buyAmount\":1}}";
        SendPost sendPost = new SendPost();
        try {
            AnomalyInfo anomalyInfo = gson.fromJson(JsonStr, AnomalyInfo.class);
            sendPost.setMessageObj(SignatureNonce, Timestamp, Topic, anomalyInfo);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private static void WorkcardStatusUpdate() {
        Gson gson = new Gson();

        String SignatureNonce = UUID.randomUUID().toString();
        String Timestamp = new DateTime().toString("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);

        String Topic = "tmall_fuwu_WorkcardStatusUpdate";
        String JsonStr = "{\"result\":{\"receiveTimeNumber\":1542629011000,\"parentBizOrderId\":250778221558604100,\"sellerNick\":\"b商家测试帐号200\",\"buyerMail\":\"b2c-test785@service.aliyun.com\",\"auctionId\":571994794751,\"buyerLocation\":350203010,\"actualTotalFee\":5500,\"payTimeNumber\":1542628761000,\"needReturnGoods\":0,\"auctionSkuProperties\":\"{\\\"@type\\\":\\\"java.util.HashMap\\\",\\\"父类目\\\":\\\"坐便器盖板\\\",\\\"类目\\\":\\\"智能坐便盖板\\\"}\",\"serviceOrderId\":250778221561604100,\"auctionPrice\":1,\"category\":\"50020034\",\"shopName\":\"b商家测试帐号200\",\"receiveTime\":\"2018-11-19 20:03:31\",\"modelNumber\":\"曼薇测试\",\"taskType\":0,\"serviceCount\":1,\"xiaoerIntervention\":false,\"serviceName\":\"卫浴小件安装\",\"sellerPunish\":false,\"taskStatus\":1,\"sellerId\":3692189295,\"excludeTest\":false,\"brand\":\"天猫测试品牌11\",\"sellerMobile\":\"\",\"payTime\":\"2018-11-19 19:59:21\",\"auctionName\":\"曼薇测试请不要拍下\",\"buyerNick\":\"c测试账号785\",\"tpName\":\"九牧厨卫官方旗舰店:店铺负责\",\"categoryId\":50020034,\"taskMemo\":\"上门安装\",\"buyerMobile\":\"18350243375\",\"tpId\":2191428291,\"serviceCode\":\"卫浴小件安装\",\"bizOrderId\":250778221559604100,\"reasonId\":0,\"buyerAddress\":\"福建 厦门 思明 莲前 福建省 厦门市 思明区 莲前街道前埔路506-508号国金广场B栋10楼\",\"solution\":0,\"id\":87195550,\"orderRelationId\":-1,\"name\":\"卫浴小件安装\",\"acceptType\":0,\"buyerId\":2201600041,\"buyerName\":\"肖先生\",\"buyerZipCode\":\"222222\",\"attributes\":{\"itemSkuProperty\":\"颜色分类:军绿色\",\"lbxNo\":\"LP00114815619306\",\"service_pattern\":\"platform\",\"servPrice\":\"5500\",\"servSkuName\":\"\"},\"buyAmount\":1}}";
        SendPost sendPost = new SendPost();
        try {
            StatusUpdate statusUpdate = gson.fromJson(JsonStr, StatusUpdate.class);
            sendPost.setMessageObj(SignatureNonce, Timestamp, Topic, statusUpdate);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }


//    public void setMessageOrderInfo(String SignatureNonce, String Timestamp, String Topic, String JsonStr) throws UnsupportedEncodingException {
//        Gson gson = new Gson();
//        String param1 = "AccessSecret=" + AccessSecret + "&AccessKeyId=" + AccessKeyId + "&SignatureNonce=" + SignatureNonce + "&Timestamp=" + Timestamp;
//        String Signature = null;
//        try {
//            Signature = md5EndcodeString(param1);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//        BASE64Encoder base64en = new BASE64Encoder();
//        Signature = base64en.encode(Signature.getBytes());
//
//        //String param2 = "AccessKeyId=" + AccessKeyId + "&SignatureNonce=" + SignatureNonce + "&Timestamp=" + Timestamp + "&Signature=" + Signature + "&Topic=" + Topic + "&JsonStr" + JsonStr;
//
//
//        //WorkcardInfo
//        DataObjectOrderInfo dataObject = new DataObjectOrderInfo();
//        dataObject = dataObject.jsonToDataOrderInfo(JsonStr);
//
//        Map<String, Object> params = new HashMap<String, Object>();
//        params.put("AccessKeyId", AccessKeyId);
//        params.put("SignatureNonce", SignatureNonce);
//        params.put("Timestamp", Timestamp);
//        params.put("Signature", Signature);
//        params.put("Topic", Topic);
//        //params.put("JsonStr", JsonStr);
//        params.put("JsonStr", dataObject);
////        params.put("JsonStr", orderInfo);
//
//        String bodyString = gson.toJson(params);
//        System.out.println(bodyString);
//
//
//
//        //sendPostMessage("http://218.5.155.206:8099/topevent?topic=" + Topic, params, "utf-8");
//       // sendPostMessage("http://218.5.155.206:7777/topevent?topic=" + Topic, bodyString, "utf-8");
//        sendPostMessage("http://218.5.155.206:8080/topevent?topic=" + Topic, bodyString, "utf-8");
////        sendPostMessage("http://demo.baogongpo.cn/TOP/v1/demo.php", bodyString, "utf-8");
////        sendPostMessage("http://demo.baogongpo.cn/test/post.php", bodyString, "utf-8");
//
//        //doJsonPost("http://218.5.155.206:7777/topevent?topic=" + Topic, bodyString);
//        //doJsonPost("http://demo.baogongpo.cn/test/post.php", bodyString);
//    }

    public void setMessageObj(String SignatureNonce, String Timestamp, String Topic, Object object) throws UnsupportedEncodingException {
        Gson gson = new Gson();
        String param1 = "AccessSecret=" + AccessSecret + "&AccessKeyId=" + AccessKeyId + "&SignatureNonce=" + SignatureNonce + "&Timestamp=" + Timestamp;
        String Signature = null;
        try {
            Signature = md5EndcodeString(param1);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        BASE64Encoder base64en = new BASE64Encoder();
        Signature = base64en.encode(Signature.getBytes());

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("AccessKeyId", AccessKeyId);
        params.put("SignatureNonce", SignatureNonce);
        params.put("Timestamp", Timestamp);
        params.put("Signature", Signature);
        params.put("Topic", Topic);
        params.put("JsonStr", object);

        String bodyString = gson.toJson(params);
        System.out.println(bodyString);



        //sendPostMessage("http://218.5.155.206:8099/topevent?topic=" + Topic, params, "utf-8");
        sendPostMessage("http://218.5.155.206:8080/topevent?topic=" + Topic, bodyString, "utf-8");
//        sendPostMessage("http://demo.baogongpo.cn/TOP/v1/demo.php", bodyString, "utf-8");
//        sendPostMessage("http://demo.baogongpo.cn/test/post.php", bodyString, "utf-8");

        //doJsonPost("http://218.5.155.206:7777/topevent?topic=" + Topic, bodyString);
        //doJsonPost("http://demo.baogongpo.cn/test/post.php", bodyString);
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
                logger.debug("发送的数据》》》"+paramString);  //写入发送数据到日志
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
                     String result =   changeInputStream(inputStream, encode);
                    logger.debug("接收的数据》》" + result);//写入返回数据到日志
                    return result;
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
    public static String md5EndcodeString(String str) throws NoSuchAlgorithmException {
        // 生成一个MD5加密计算摘要
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 计算md5函数
        md.update(str.getBytes());
        // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
        // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
        return new BigInteger(1, md.digest()).toString(16);
    }


}
