package com.jomoo.jst;

import net.sf.json.JSONObject;


/**
 * 新的工单
 *
 * @author nodie
 * @Time 2018-10-12 11:50:44
 */

public class DataObjectOrderInfo {


    private String receiveTimeNumber;   //接收的时间
    private String parentBizOrderId;    //主订单号
    private String buyerMail;           //购买的邮件
    private String sellerNick;          //卖家昵称
    private String auctionId;           //ID
    private String buyerLocation;       //购买地址
    private String actualTotalFee;
    private String needReturnGoods;
    private String auctionSkuProperties;    //商品附加属性
    private String serviceOrderId;
    private String auctionPrice;
    private String category;
    private String shopName;
    private String receiveTime;
    private String modelNumber;
    private String taskType;            //工单类型
    private String serviceCount;        //服务数量
    private String xiaoerIntervention;
    private String serviceName;
    private String sellerPunish;        //卖家punish
    private String taskStatus;
    private String sellerId;            //卖家 ID
    private String brand;               //品牌
    private String sellerMobile;        //卖家手机
    private String auctionName;
    private String buyerNick;           //买家昵称
    private String tpName;              //服务商名称
    private String categoryId;          //分类 ID
    private String taskMemo;            //工单描述
    private String buyerMobile;         //买家手机
    private String tpId;                //服务商 ID
    private String serviceCode;         //服务编号
    private String bizOrderId;
    private String reasonId;
    private String buyerAddress;        //买家地址
    private String solution;
    private String tb_id;               //淘宝 ID
    private String name;
    private String orderRelationId;
    private String acceptType;
    private String buyerId;             //买家 ID
    private String buyerName;           //买家名称
    private String buyerZipCode;        //买家邮编
    private String attributes;
    private String buyAmount;           //购买金额
    private String itemSkuProperty;
    private String lbxNo;
    private String service_pattern;
    private String servPrice;


    public DataObjectOrderInfo() {
    }

    public String getReceiveTimeNumber() {
        return receiveTimeNumber;
    }

    public void setReceiveTimeNumber(String receiveTimeNumber) {
        this.receiveTimeNumber = receiveTimeNumber;
    }

    public String getParentBizOrderId() {
        return parentBizOrderId;
    }

    public void setParentBizOrderId(String parentBizOrderId) {
        this.parentBizOrderId = parentBizOrderId;
    }

    public String getBuyerMail() {
        return buyerMail;
    }

    public void setBuyerMail(String buyerMail) {
        this.buyerMail = buyerMail;
    }

    public String getSellerNick() {
        return sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public String getBuyerLocation() {
        return buyerLocation;
    }

    public void setBuyerLocation(String buyerLocation) {
        this.buyerLocation = buyerLocation;
    }

    public String getActualTotalFee() {
        return actualTotalFee;
    }

    public void setActualTotalFee(String actualTotalFee) {
        this.actualTotalFee = actualTotalFee;
    }

    public String getNeedReturnGoods() {
        return needReturnGoods;
    }

    public void setNeedReturnGoods(String needReturnGoods) {
        this.needReturnGoods = needReturnGoods;
    }

    public String getAuctionSkuProperties() {
        return auctionSkuProperties;
    }

    public void setAuctionSkuProperties(String auctionSkuProperties) {
        this.auctionSkuProperties = auctionSkuProperties;
    }

    public String getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(String serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    public String getAuctionPrice() {
        return auctionPrice;
    }

    public void setAuctionPrice(String auctionPrice) {
        this.auctionPrice = auctionPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(String serviceCount) {
        this.serviceCount = serviceCount;
    }

    public String getXiaoerIntervention() {
        return xiaoerIntervention;
    }

    public void setXiaoerIntervention(String xiaoerIntervention) {
        this.xiaoerIntervention = xiaoerIntervention;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getSellerPunish() {
        return sellerPunish;
    }

    public void setSellerPunish(String sellerPunish) {
        this.sellerPunish = sellerPunish;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSellerMobile() {
        return sellerMobile;
    }

    public void setSellerMobile(String sellerMobile) {
        this.sellerMobile = sellerMobile;
    }

    public String getAuctionName() {
        return auctionName;
    }

    public void setAuctionName(String auctionName) {
        this.auctionName = auctionName;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getTpName() {
        return tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getTaskMemo() {
        return taskMemo;
    }

    public void setTaskMemo(String taskMemo) {
        this.taskMemo = taskMemo;
    }

    public String getBuyerMobile() {
        return buyerMobile;
    }

    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile;
    }

    public String getTpId() {
        return tpId;
    }

    public void setTpId(String tpId) {
        this.tpId = tpId;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getBizOrderId() {
        return bizOrderId;
    }

    public void setBizOrderId(String bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public String getReasonId() {
        return reasonId;
    }

    public void setReasonId(String reasonId) {
        this.reasonId = reasonId;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getTb_id() {
        return tb_id;
    }

    public void setTb_id(String tb_id) {
        this.tb_id = tb_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderRelationId() {
        return orderRelationId;
    }

    public void setOrderRelationId(String orderRelationId) {
        this.orderRelationId = orderRelationId;
    }

    public String getAcceptType() {
        return acceptType;
    }

    public void setAcceptType(String acceptType) {
        this.acceptType = acceptType;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerZipCode() {
        return buyerZipCode;
    }

    public void setBuyerZipCode(String buyerZipCode) {
        this.buyerZipCode = buyerZipCode;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(String buyAmount) {
        this.buyAmount = buyAmount;
    }

    public String getItemSkuProperty() {
        return itemSkuProperty;
    }

    public void setItemSkuProperty(String itemSkuProperty) {
        this.itemSkuProperty = itemSkuProperty;
    }

    public String getLbxNo() {
        return lbxNo;
    }

    public void setLbxNo(String lbxNo) {
        this.lbxNo = lbxNo;
    }

    public String getService_pattern() {
        return service_pattern;
    }

    public void setService_pattern(String service_pattern) {
        this.service_pattern = service_pattern;
    }

    public String getServPrice() {
        return servPrice;
    }

    public void setServPrice(String servPrice) {
        this.servPrice = servPrice;
    }


    /**
     * 格式化 json 到 DataOrderInfo 对象
     *
     * @param jsonString
     * @return DataObjectOrderInfo
     */
    public DataObjectOrderInfo jsonToDataOrderInfo(String jsonString) {
        DataObjectOrderInfo dataObject = new DataObjectOrderInfo();

        JSONObject resultJsonObject = JSONObject.fromObject(JSONObject.fromObject(jsonString).getString("result"));

        if (resultJsonObject.containsKey("receiveTimeNumber")) {
            dataObject.setReceiveTime(resultJsonObject.getString("receiveTimeNumber"));
        }
        if (resultJsonObject.containsKey("parentBizOrderId")) {
            dataObject.setParentBizOrderId(resultJsonObject.getString("parentBizOrderId"));
        }
        if (resultJsonObject.containsKey("buyerMail")) {
            dataObject.setBuyerMail(resultJsonObject.getString("buyerMail"));
        }
        if (resultJsonObject.containsKey("sellerNick")) {
            dataObject.setSellerNick(resultJsonObject.getString("sellerNick"));
        }
        if (resultJsonObject.containsKey("auctionId")) {
            dataObject.setAuctionId(resultJsonObject.getString("auctionId"));
        }
        if (resultJsonObject.containsKey("buyerLocation")) {
            dataObject.setBuyerLocation(resultJsonObject.getString("buyerLocation"));
        }
        if (resultJsonObject.containsKey("actualTotalFee")) {
            dataObject.setActualTotalFee(resultJsonObject.getString("actualTotalFee"));
        }
        if (resultJsonObject.containsKey("needReturnGoods")) {
            dataObject.setNeedReturnGoods(resultJsonObject.getString("needReturnGoods"));
        }
        if (resultJsonObject.containsKey("auctionSkuProperties")) {
            dataObject.setAuctionSkuProperties(resultJsonObject.getString("auctionSkuProperties"));
        }
        if (resultJsonObject.containsKey("serviceOrderId")) {
            dataObject.setServiceOrderId(resultJsonObject.getString("serviceOrderId"));
        }
        if (resultJsonObject.containsKey("auctionPrice")) {
            dataObject.setAuctionPrice(resultJsonObject.getString("auctionPrice"));
        }
        if (resultJsonObject.containsKey("category")) {
            dataObject.setCategory(resultJsonObject.getString("category"));
        }
        if (resultJsonObject.containsKey("shopName")) {
            dataObject.setShopName(resultJsonObject.getString("shopName"));
        }
        if (resultJsonObject.containsKey("receiveTime")) {
            dataObject.setReceiveTime(resultJsonObject.getString("receiveTime"));
        }
        if (resultJsonObject.containsKey("modelNumber")) {
            dataObject.setModelNumber(resultJsonObject.getString("modelNumber"));
        }
        if (resultJsonObject.containsKey("taskType")) {
            dataObject.setTaskType(resultJsonObject.getString("taskType"));
        }
        if (resultJsonObject.containsKey("serviceCount")) {
            dataObject.setServiceCount(resultJsonObject.getString("serviceCount"));
        }
        if (resultJsonObject.containsKey("xiaoerIntervention")) {
            dataObject.setXiaoerIntervention(resultJsonObject.getString("xiaoerIntervention"));
        }
        if (resultJsonObject.containsKey("serviceName")) {
            dataObject.setServiceName(resultJsonObject.getString("serviceName"));
        }
        if (resultJsonObject.containsKey("sellerPunish")) {
            dataObject.setSellerPunish(resultJsonObject.getString("sellerPunish"));
        }
        if (resultJsonObject.containsKey("taskStatus")) {
            dataObject.setTaskStatus(resultJsonObject.getString("taskStatus"));
        }
        if (resultJsonObject.containsKey("sellerId")) {
            dataObject.setSellerId(resultJsonObject.getString("sellerId"));
        }
        if (resultJsonObject.containsKey("brand")) {
            dataObject.setBrand(resultJsonObject.getString("brand"));
        }
        if (resultJsonObject.containsKey("sellerMobile")) {
            dataObject.setSellerMobile(resultJsonObject.getString("sellerMobile"));
        }
        if (resultJsonObject.containsKey("auctionName")) {
            dataObject.setAuctionName(resultJsonObject.getString("auctionName"));
        }
        if (resultJsonObject.containsKey("buyerNick")) {
            dataObject.setBuyerNick(resultJsonObject.getString("buyerNick"));
        }
        if (resultJsonObject.containsKey("tpName")) {
            dataObject.setTpName(resultJsonObject.getString("tpName"));
        }
        if (resultJsonObject.containsKey("categoryId")) {
            dataObject.setCategoryId(resultJsonObject.getString("categoryId"));
        }
        if (resultJsonObject.containsKey("taskMemo")) {
            dataObject.setTaskMemo(resultJsonObject.getString("taskMemo"));
        }
        if (resultJsonObject.containsKey("buyerMobile")) {
            //如果有移动电话，就填入移动电话
            //如果没有移动电话，就找座机填入
            //如果两个都没有，就是空
            dataObject.setBuyerMobile(resultJsonObject.getString("buyerMobile"));
        } else {
            if (resultJsonObject.containsKey("buyerPhone")) {
                dataObject.setBuyerMobile(resultJsonObject.getString("buyerPhone"));
            }
        }
        if (resultJsonObject.containsKey("tpId")) {
            dataObject.setTpId(resultJsonObject.getString("tpId"));
        }
        if (resultJsonObject.containsKey("serviceCode")) {
            dataObject.setServiceCode(resultJsonObject.getString("serviceCode"));
        }
        if (resultJsonObject.containsKey("bizOrderId")) {
            dataObject.setBizOrderId(resultJsonObject.getString("bizOrderId"));
        }
        if (resultJsonObject.containsKey("reasonId")) {
            dataObject.setReasonId(resultJsonObject.getString("reasonId"));
        }
        if (resultJsonObject.containsKey("buyerAddress")) {
            dataObject.setBuyerAddress(resultJsonObject.getString("buyerAddress"));
        }
        if (resultJsonObject.containsKey("solution")) {
            dataObject.setSolution(resultJsonObject.getString("solution"));
        }
        if (resultJsonObject.containsKey("id")) {
            dataObject.setTb_id(resultJsonObject.getString("id"));//id = tb_id
        }
        if (resultJsonObject.containsKey("name")) {
            dataObject.setName(resultJsonObject.getString("name"));
        }
        if (resultJsonObject.containsKey("orderRelationId")) {
            dataObject.setOrderRelationId(resultJsonObject.getString("orderRelationId"));
        }
        if (resultJsonObject.containsKey("acceptType")) {
            dataObject.setAcceptType(resultJsonObject.getString("acceptType"));
        }
        if (resultJsonObject.containsKey("buyerId")) {
            dataObject.setBuyerId(resultJsonObject.getString("buyerId"));
        }
        if (resultJsonObject.containsKey("buyerName")) {
            dataObject.setBuyerName(resultJsonObject.getString("buyerName"));
        }
        if (resultJsonObject.containsKey("buyerZipCode")) {
            dataObject.setBuyerZipCode(resultJsonObject.getString("buyerZipCode"));
        }
        if (resultJsonObject.containsKey("attributes")) {
            dataObject.setAttributes(resultJsonObject.getString("attributes"));
        }
        if (resultJsonObject.containsKey("buyAmount")) {
            dataObject.setBuyAmount(resultJsonObject.getString("buyAmount"));
        }


        String attributes = dataObject.getAttributes();
        JSONObject attributesJsonObject = JSONObject.fromObject(attributes);

        if (attributesJsonObject.containsKey("itemSkuProperty")) {
            dataObject.setItemSkuProperty(attributesJsonObject.getString("itemSkuProperty"));
        } else {
            dataObject.setItemSkuProperty("");
        }

        if (resultJsonObject.containsKey("lbxNo")) {
            dataObject.setLbxNo(attributesJsonObject.getString("lbxNo"));
        }
        if (resultJsonObject.containsKey("service_pattern")) {
            dataObject.setService_pattern(attributesJsonObject.getString("service_pattern"));
        }
        if (resultJsonObject.containsKey("servPrice")) {
            dataObject.setServPrice(attributesJsonObject.getString("servPrice"));
        }


        return dataObject;

    }

}
