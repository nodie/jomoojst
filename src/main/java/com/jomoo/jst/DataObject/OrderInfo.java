package com.jomoo.jst.DataObject;


public class OrderInfo {

    /**
     * result : {"receiveTimeNumber":1545960694000,"parentBizOrderId":308122720937810418,"sellerNick":"九牧厨卫官方旗舰店","buyerMail":"","auctionId":557599557361,"buyerLocation":451202001,"actualTotalFee":12000,"payTimeNumber":1545911959000,"needReturnGoods":0,"auctionSkuProperties":"{\"@type\":\"java.util.HashMap\",\"父类目\":\"卫浴家具\",\"长度(cm)\":\"60\",\"类目\":\"浴室柜组合\"}","sellerPhone":"0592-4001919999","serviceOrderId":308122720939810418,"auctionPrice":220900,"category":"50020072","shopName":"九牧厨卫官方旗舰店","receiveTime":"2018-12-28 09:31:34","taskType":0,"serviceCount":1,"xiaoerIntervention":false,"serviceName":"卫浴大件安装","sellerPunish":false,"taskStatus":1,"sellerId":2191428291,"excludeTest":false,"brand":"JOMOO/九牧","sellerMobile":"18859969566","payTime":"2018-12-27 19:59:19","auctionName":"jomoo九牧浴室柜组合 PVC悬挂式洗脸洗手面盆池洗漱台盆卫生间","buyerNick":"小小小小上33305087","tpName":"九牧厨卫官方旗舰店:店铺负责","categoryId":50020072,"taskMemo":"上门安装","buyerMobile":"17776585727","tpId":2191428291,"serviceCode":"卫浴大件安装","bizOrderId":308122720938810418,"reasonId":0,"buyerAddress":"广西壮族自治区 河池市 金城江区 金城江街道 金城江街道区法院斜对面宏杰汽车修理厂","solution":0,"id":94451042,"orderRelationId":-1,"name":"卫浴大件安装","acceptType":0,"buyerId":2650811804,"buyerName":"覃绍上","buyerZipCode":"547000","attributes":{"settlement":"true","itemSkuProperty":"颜色分类:PVC板60cm带侧柜（不含龙头,还需另购）","outerIdSKU":"6957210287940","lbxNo":"LP00118773842722","service_pattern":"platform","servPrice":"12000","servSkuName":""},"buyAmount":1}
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
         * receiveTimeNumber : 1545960694000
         * parentBizOrderId : 308122720937810418
         * sellerNick : 九牧厨卫官方旗舰店
         * buyerMail :
         * auctionId : 557599557361
         * buyerLocation : 451202001
         * actualTotalFee : 12000
         * payTimeNumber : 1545911959000
         * needReturnGoods : 0
         * auctionSkuProperties : {"@type":"java.util.HashMap","父类目":"卫浴家具","长度(cm)":"60","类目":"浴室柜组合"}
         * sellerPhone : 0592-4001919999
         * serviceOrderId : 308122720939810418
         * auctionPrice : 220900
         * category : 50020072
         * shopName : 九牧厨卫官方旗舰店
         * receiveTime : 2018-12-28 09:31:34
         * taskType : 0
         * serviceCount : 1
         * xiaoerIntervention : false
         * serviceName : 卫浴大件安装
         * sellerPunish : false
         * taskStatus : 1
         * sellerId : 2191428291
         * excludeTest : false
         * brand : JOMOO/九牧
         * sellerMobile : 18859969566
         * payTime : 2018-12-27 19:59:19
         * auctionName : jomoo九牧浴室柜组合 PVC悬挂式洗脸洗手面盆池洗漱台盆卫生间
         * buyerNick : 小小小小上33305087
         * tpName : 九牧厨卫官方旗舰店:店铺负责
         * categoryId : 50020072
         * taskMemo : 上门安装
         * buyerMobile : 17776585727
         * tpId : 2191428291
         * serviceCode : 卫浴大件安装
         * bizOrderId : 308122720938810418
         * reasonId : 0
         * buyerAddress : 广西壮族自治区 河池市 金城江区 金城江街道 金城江街道区法院斜对面宏杰汽车修理厂
         * solution : 0
         * id : 94451042
         * orderRelationId : -1
         * name : 卫浴大件安装
         * acceptType : 0
         * buyerId : 2650811804
         * buyerName : 覃绍上
         * buyerZipCode : 547000
         * attributes : {"settlement":"true","itemSkuProperty":"颜色分类:PVC板60cm带侧柜（不含龙头,还需另购）","outerIdSKU":"6957210287940","lbxNo":"LP00118773842722","service_pattern":"platform","servPrice":"12000","servSkuName":""}
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
        private String sellerPhone;
        private long serviceOrderId;
        private int auctionPrice;
        private String category;
        private String shopName;
        private String receiveTime;
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
        private long buyerId;
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

        public String getSellerPhone() {
            return sellerPhone;
        }

        public void setSellerPhone(String sellerPhone) {
            this.sellerPhone = sellerPhone;
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

        public long getBuyerId() {
            return buyerId;
        }

        public void setBuyerId(long buyerId) {
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
             * settlement : true
             * itemSkuProperty : 颜色分类:PVC板60cm带侧柜（不含龙头,还需另购）
             * outerIdSKU : 6957210287940
             * lbxNo : LP00118773842722
             * service_pattern : platform
             * servPrice : 12000
             * servSkuName :
             */

            private String settlement;
            private String itemSkuProperty;
            private String outerIdSKU;
            private String lbxNo;
            private String service_pattern;
            private String servPrice;
            private String servSkuName;

            public String getSettlement() {
                return settlement;
            }

            public void setSettlement(String settlement) {
                this.settlement = settlement;
            }

            public String getItemSkuProperty() {
                return itemSkuProperty;
            }

            public void setItemSkuProperty(String itemSkuProperty) {
                this.itemSkuProperty = itemSkuProperty;
            }

            public String getOuterIdSKU() {
                return outerIdSKU;
            }

            public void setOuterIdSKU(String outerIdSKU) {
                this.outerIdSKU = outerIdSKU;
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
        }
    }
}

