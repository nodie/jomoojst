package com.jomoo.jst.DataObject;

import com.google.gson.Gson;

public class dataDecodeDemo {
    private static String orderInfoJson = "{\"result\":{\"receiveTimeNumber\":1540449464000,\"parentBizOrderId\":231395783928043278,\"sellerNick\":\"三星智能锁旗舰店\",\"buyerMail\":\"1368299287@qq.com\",\"auctionId\":556821142815,\"buyerLocation\":500103003,\"actualTotalFee\":22000,\"payTimeNumber\":1540396724000,\"needReturnGoods\":0,\"auctionSkuProperties\":\"{\\\"@type\\\":\\\"java.util.HashMap\\\",\\\"父类目\\\":\\\"锁具\\\",\\\"类目\\\":\\\"电子门锁\\\"}\",\"serviceOrderId\":231395783930043278,\"auctionPrice\":318000,\"category\":\"50021306\",\"shopName\":\"三星智能锁旗舰店\",\"receiveTime\":\"2018-10-25 14:37:44\",\"modelNumber\":\"728\",\"taskType\":0,\"serviceCount\":1,\"xiaoerIntervention\":false,\"serviceName\":\"电子门锁安装\",\"sellerPunish\":false,\"taskStatus\":1,\"sellerId\":3363576213,\"excludeTest\":false,\"brand\":\"Samsung/三星\",\"sellerMobile\":\"18918855785\",\"payTime\":\"2018-10-24 23:58:44\",\"auctionName\":\"三星 指纹锁密码锁家用防盗门锁智能电子锁 推拉手机开门 DP728\",\"buyerNick\":\"jiaoweifeng6\",\"tpName\":\"典越电子商务公司\",\"categoryId\":50021306,\"taskMemo\":\"上门安装\",\"buyerMobile\":\"18725780178\",\"tpId\":2468433189,\"serviceCode\":\"电子门锁安装\",\"bizOrderId\":231395783929043278,\"reasonId\":0,\"buyerAddress\":\"重庆 重庆 渝中 解放碑 民权路88号R2栋45-9号\",\"solution\":0,\"id\":78407065,\"orderRelationId\":-1,\"name\":\"电子门锁安装\",\"acceptType\":0,\"buyerId\":850047832,\"buyerName\":\"焦渭峰\",\"buyerZipCode\":\"000000\",\"attributes\":{\"itemSkuProperty\":\"饰面颜色:728香槟金内开+【无忧安装】\",\"lbxNo\":\"LP00114564887525\",\"service_pattern\":\"platform\",\"servPrice\":\"22000\",\"servSkuName\":\"\"},\"buyAmount\":1}}";
    private static String anomalyInfoJson = "{\"result\":{\"buyer_nick\":\"batiqs\",\"id\":163474,\"question_content\":\"拒绝安装/安装服务未完成\",\"workcard_id\":77010009,\"question_type\":\"075\",\"status\":1,\"service_order_id\":244331136981856056,\"recourse_message_list\":[{\"recourse_text\":\"购买前与客服明确过本地可安装才拍下商品，期间销售方还电话确认过安装地址。\",\"image_urls\":[\"//img.alicdn.com/imgextra/i2/6000000004521/O1CN011jGf5A2VM9nhPIk_!!6000000004521-0-miaocare.jpg\",\"//img.alicdn.com/imgextra/i4/6000000007662/O1CN0126TF7oT36UwGEuN_!!6000000007662-0-miaocare.jpg\",\"//img.alicdn.com/imgextra/i2/6000000002009/O1CN011QiAAGzyvsvM9H8_!!6000000002009-0-miaocare.jpg\"],\"submit_time\":\"2018-10-22 22:51:00\"}],\"service_code\":\"电子门锁安装\",\"parent_biz_order_id\":244331136979856056,\"submit_time\":\"2018-10-22 22:51:00\",\"biz_order_id\":244331136980856056},\"anomaly_recourse_id\":163474}";
    private static String statusUpdateJson = "{\"workcard_id\":75822130,\"Tp_id\":2468433189,\"status\":16,\"update_date\":\"2018-10-19 09:03:08\",\"type\":1,\"comments\":\"null\"}";
    private static String monitorMessageJson = "{\"id\":33776424,\"result\":{\"content\":\"请及时处理签收超过16小时未预约的工单，详情如下：父订单编号：268242725497663799，服务子订单：268242725500663799，服务工\n" +
            "单号：103427952\",\"id\":33776424,\"level\":1,\"gmtCreate\":\"2019-03-15 09:15:05\",\"receiverId\":2191428291,\"status\":1,\"ruleId\":\"JZ_INSTALL_RETURN_RESERVE_INFO_WARNING_RULE\",\"\n" +
            "serviceCode\":\"卫浴大件安装\",\"bizType\":1,\"bizId\":103427952}}";

    public static void main(String[] args) {
        Gson gson = new Gson();

        OrderInfo orderInfo = gson.fromJson(orderInfoJson, OrderInfo.class);

        StatusUpdate statusUpdate = gson.fromJson(statusUpdateJson, StatusUpdate.class);

        AnomalyInfo anomalyInfo = gson.fromJson(anomalyInfoJson, AnomalyInfo.class);

        String o = gson.toJson(orderInfo);
        System.out.println(o);

        String s = gson.toJson(statusUpdate);
        System.out.println(s);

        String a = gson.toJson(anomalyInfo);
        System.out.println(a);
    }
}
