package com.jomoo.jst.DataObject;


public class OrderInfo {

    /**
     * result : {"receiveTimeNumber":1540449464000,"parentBizOrderId":231395783928043278,"sellerNick":"三星智能锁旗舰店","buyerMail":"1368299287@qq.com","auctionId":556821142815,"buyerLocation":500103003,"actualTotalFee":22000,"payTimeNumber":1540396724000,"needReturnGoods":0,"auctionSkuProperties":"{\"@type\":\"java.util.HashMap\",\"父类目\":\"锁具\",\"类目\":\"电子门锁\"}","serviceOrderId":231395783930043278,"auctionPrice":318000,"category":"50021306","shopName":"三星智能锁旗舰店","receiveTime":"2018-10-25 14:37:44","modelNumber":"728","taskType":0,"serviceCount":1,"xiaoerIntervention":false,"serviceName":"电子门锁安装","sellerPunish":false,"taskStatus":1,"sellerId":3363576213,"excludeTest":false,"brand":"Samsung/三星","sellerMobile":"18918855785","payTime":"2018-10-24 23:58:44","auctionName":"三星 指纹锁密码锁家用防盗门锁智能电子锁 推拉手机开门 DP728","buyerNick":"jiaoweifeng6","tpName":"典越电子商务公司","categoryId":50021306,"taskMemo":"上门安装","buyerMobile":"18725780178","tpId":2468433189,"serviceCode":"电子门锁安装","bizOrderId":231395783929043278,"reasonId":0,"buyerAddress":"重庆 重庆 渝中 解放碑 民权路88号R2栋45-9号","solution":0,"id":78407065,"orderRelationId":-1,"name":"电子门锁安装","acceptType":0,"buyerId":850047832,"buyerName":"焦渭峰","buyerZipCode":"000000","attributes":{"itemSkuProperty":"饰面颜色:728香槟金内开+【无忧安装】","lbxNo":"LP00114564887525","service_pattern":"platform","servPrice":"22000","servSkuName":""},"buyAmount":1}
     */

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * receiveTimeNumber : 1540449464000
         * parentBizOrderId : 231395783928043278
         * sellerNick : 三星智能锁旗舰店
         * buyerMail : 1368299287@qq.com
         * auctionId : 556821142815
         * buyerLocation : 500103003
         * actualTotalFee : 22000
         * payTimeNumber : 1540396724000
         * needReturnGoods : 0
         * auctionSkuProperties : {"@type":"java.util.HashMap","父类目":"锁具","类目":"电子门锁"}
         * serviceOrderId : 231395783930043278
         * auctionPrice : 318000
         * category : 50021306
         * shopName : 三星智能锁旗舰店
         * receiveTime : 2018-10-25 14:37:44
         * modelNumber : 728
         * taskType : 0
         * serviceCount : 1
         * xiaoerIntervention : false
         * serviceName : 电子门锁安装
         * sellerPunish : false
         * taskStatus : 1
         * sellerId : 3363576213
         * excludeTest : false
         * brand : Samsung/三星
         * sellerMobile : 18918855785
         * payTime : 2018-10-24 23:58:44
         * auctionName : 三星 指纹锁密码锁家用防盗门锁智能电子锁 推拉手机开门 DP728
         * buyerNick : jiaoweifeng6
         * tpName : 典越电子商务公司
         * categoryId : 50021306
         * taskMemo : 上门安装
         * buyerMobile : 18725780178
         * tpId : 2468433189
         * serviceCode : 电子门锁安装
         * bizOrderId : 231395783929043278
         * reasonId : 0
         * buyerAddress : 重庆 重庆 渝中 解放碑 民权路88号R2栋45-9号
         * solution : 0
         * id : 78407065
         * orderRelationId : -1
         * name : 电子门锁安装
         * acceptType : 0
         * buyerId : 850047832
         * buyerName : 焦渭峰
         * buyerZipCode : 000000
         * attributes : {"itemSkuProperty":"饰面颜色:728香槟金内开+【无忧安装】","lbxNo":"LP00114564887525","service_pattern":"platform","servPrice":"22000","servSkuName":""}
         * buyAmount : 1
         */

        private long receiveTimeNumber;
        private long parentBizOrderId;
        private String sellerNick;
        private String buyerMail;
        private long auctionId;
        private int buyerLocation;
        private int actualTotalFee;
        private long payTimeNumber;
        private int needReturnGoods;
        private String auctionSkuProperties;
        private long serviceOrderId;
        private int auctionPrice;
        private String category;
        private String shopName;
        private String receiveTime;
        private String modelNumber;
        private int taskType;
        private int serviceCount;
        private boolean xiaoerIntervention;
        private String serviceName;
        private boolean sellerPunish;
        private int taskStatus;
        private long sellerId;
        private boolean excludeTest;
        private String brand;
        private String sellerMobile;
        private String payTime;
        private String auctionName;
        private String buyerNick;
        private String tpName;
        private int categoryId;
        private String taskMemo;
        private String buyerMobile;
        private long tpId;
        private String serviceCode;
        private long bizOrderId;
        private int reasonId;
        private String buyerAddress;
        private int solution;
        private int id;
        private int orderRelationId;
        private String name;
        private int acceptType;
        private String buyerId;
        private String buyerName;
        private String buyerZipCode;
        private AttributesBean attributes;
        private int buyAmount;

        public long getReceiveTimeNumber() {
            return receiveTimeNumber;
        }

        public void setReceiveTimeNumber(long receiveTimeNumber) {
            this.receiveTimeNumber = receiveTimeNumber;
        }

        public long getParentBizOrderId() {
            return parentBizOrderId;
        }

        public void setParentBizOrderId(long parentBizOrderId) {
            this.parentBizOrderId = parentBizOrderId;
        }

        public String getSellerNick() {
            return sellerNick;
        }

        public void setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
        }

        public String getBuyerMail() {
            return buyerMail;
        }

        public void setBuyerMail(String buyerMail) {
            this.buyerMail = buyerMail;
        }

        public long getAuctionId() {
            return auctionId;
        }

        public void setAuctionId(long auctionId) {
            this.auctionId = auctionId;
        }

        public int getBuyerLocation() {
            return buyerLocation;
        }

        public void setBuyerLocation(int buyerLocation) {
            this.buyerLocation = buyerLocation;
        }

        public int getActualTotalFee() {
            return actualTotalFee;
        }

        public void setActualTotalFee(int actualTotalFee) {
            this.actualTotalFee = actualTotalFee;
        }

        public long getPayTimeNumber() {
            return payTimeNumber;
        }

        public void setPayTimeNumber(long payTimeNumber) {
            this.payTimeNumber = payTimeNumber;
        }

        public int getNeedReturnGoods() {
            return needReturnGoods;
        }

        public void setNeedReturnGoods(int needReturnGoods) {
            this.needReturnGoods = needReturnGoods;
        }

        public String getAuctionSkuProperties() {
            return auctionSkuProperties;
        }

        public void setAuctionSkuProperties(String auctionSkuProperties) {
            this.auctionSkuProperties = auctionSkuProperties;
        }

        public long getServiceOrderId() {
            return serviceOrderId;
        }

        public void setServiceOrderId(long serviceOrderId) {
            this.serviceOrderId = serviceOrderId;
        }

        public int getAuctionPrice() {
            return auctionPrice;
        }

        public void setAuctionPrice(int auctionPrice) {
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

        public int getTaskType() {
            return taskType;
        }

        public void setTaskType(int taskType) {
            this.taskType = taskType;
        }

        public int getServiceCount() {
            return serviceCount;
        }

        public void setServiceCount(int serviceCount) {
            this.serviceCount = serviceCount;
        }

        public boolean isXiaoerIntervention() {
            return xiaoerIntervention;
        }

        public void setXiaoerIntervention(boolean xiaoerIntervention) {
            this.xiaoerIntervention = xiaoerIntervention;
        }

        public String getServiceName() {
            return serviceName;
        }

        public void setServiceName(String serviceName) {
            this.serviceName = serviceName;
        }

        public boolean isSellerPunish() {
            return sellerPunish;
        }

        public void setSellerPunish(boolean sellerPunish) {
            this.sellerPunish = sellerPunish;
        }

        public int getTaskStatus() {
            return taskStatus;
        }

        public void setTaskStatus(int taskStatus) {
            this.taskStatus = taskStatus;
        }

        public long getSellerId() {
            return sellerId;
        }

        public void setSellerId(long sellerId) {
            this.sellerId = sellerId;
        }

        public boolean isExcludeTest() {
            return excludeTest;
        }

        public void setExcludeTest(boolean excludeTest) {
            this.excludeTest = excludeTest;
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

        public String getPayTime() {
            return payTime;
        }

        public void setPayTime(String payTime) {
            this.payTime = payTime;
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

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
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

        public long getTpId() {
            return tpId;
        }

        public void setTpId(long tpId) {
            this.tpId = tpId;
        }

        public String getServiceCode() {
            return serviceCode;
        }

        public void setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
        }

        public long getBizOrderId() {
            return bizOrderId;
        }

        public void setBizOrderId(long bizOrderId) {
            this.bizOrderId = bizOrderId;
        }

        public int getReasonId() {
            return reasonId;
        }

        public void setReasonId(int reasonId) {
            this.reasonId = reasonId;
        }

        public String getBuyerAddress() {
            return buyerAddress;
        }

        public void setBuyerAddress(String buyerAddress) {
            this.buyerAddress = buyerAddress;
        }

        public int getSolution() {
            return solution;
        }

        public void setSolution(int solution) {
            this.solution = solution;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getOrderRelationId() {
            return orderRelationId;
        }

        public void setOrderRelationId(int orderRelationId) {
            this.orderRelationId = orderRelationId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAcceptType() {
            return acceptType;
        }

        public void setAcceptType(int acceptType) {
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

        public AttributesBean getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

        public int getBuyAmount() {
            return buyAmount;
        }

        public void setBuyAmount(int buyAmount) {
            this.buyAmount = buyAmount;
        }

        public static class AttributesBean {
            /**
             * itemSkuProperty : 饰面颜色:728香槟金内开+【无忧安装】
             * lbxNo : LP00114564887525
             * service_pattern : platform
             * servPrice : 22000
             * servSkuName :
             */

            private String itemSkuProperty;
            private String lbxNo;
            private String service_pattern;
            private String servPrice;
            private String servSkuName;
            private String outerIdSKU;

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

            public String getServSkuName() {
                return servSkuName;
            }

            public void setServSkuName(String servSkuName) {
                this.servSkuName = servSkuName;
            }

            public String getOuterIdSKU() {
                return outerIdSKU;
            }

            public void setOuterIdSKU(String outerIdSKU) {
                this.outerIdSKU = outerIdSKU;
            }
        }
    }
}

