package com.jomoo.jst.DataObject;

public class ServiceMonitorMessage {

    /**
     * id : 30646084
     * result : {"content":"请及时处理签收超过16小时未预约的工单，详情如下：父订单编号：333493216488796538，服务子订单：333493216492796538，服务工 单号：102258543","id":30646084,"level":1,"gmtCreate":"2019-03-03 01:55:03","receiverId":2191428291,"status":1,"ruleId":"JZ_INSTALL_RETURN_RESERVE_INFO_WARNING_RULE"," serviceCode":"卫浴大件安装","bizType":1,"bizId":102258543}
     */

    private int id;
    private ResultBean result;

    public static class ResultBean {
        /**
         * content : 请及时处理签收超过16小时未预约的工单，详情如下：父订单编号：333493216488796538，服务子订单：333493216492796538，服务工 单号：102258543
         * id : 30646084
         * level : 1
         * gmtCreate : 2019-03-03 01:55:03
         * receiverId : 2191428291
         * status : 1
         * ruleId : JZ_INSTALL_RETURN_RESERVE_INFO_WARNING_RULE
         *  serviceCode : 卫浴大件安装
         * bizType : 1
         * bizId : 102258543
         */

        private String content;
        private int id;
        private int level;
        private String gmtCreate;
        private long receiverId;
        private int status;
        private String ruleId;
        private String serviceCode;
        private int bizType;
        private int bizId;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getGmtCreate() {
            return gmtCreate;
        }

        public void setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
        }

        public long getReceiverId() {
            return receiverId;
        }

        public void setReceiverId(long receiverId) {
            this.receiverId = receiverId;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getRuleId() {
            return ruleId;
        }

        public void setRuleId(String ruleId) {
            this.ruleId = ruleId;
        }
    }
}
