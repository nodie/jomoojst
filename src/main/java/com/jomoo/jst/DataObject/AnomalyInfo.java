package com.jomoo.jst.DataObject;

import java.util.List;

//{"result":{"buyer_nick":"batiqs","id":163474,"question_content":"拒绝安装/安装服务未完成","workcard_id":77010009,"question_type":"075","status":1,"service_order_id":244331136981856056,"recourse_message_list":[{"recourse_text":"购买前与客服明确过本地可安装才拍下商品，期间销售方还电话确认过安装地址。商品到达后却告知本地>无法安装，让寄回商品。因为销售方的不负责，导致本人错失活动期间选择其他商品的机会。特此请求平台方予以介入，给本人一个妥善的处理方式，本人不同意无条件退货，销售方必须为自己不负责的行为负责。","image_urls":["//img.alicdn.com/imgextra/i2/6000000004521/O1CN011jGf5A2VM9nhPIk_!!6000000004521-0-miaocare.jpg","//img.alicdn.com/imgextra/i4/6000000007662/O1CN0126TF7oT36UwGEuN_!!6000000007662-0-miaocare.jpg","//img.alicdn.com/imgextra/i2/6000000002009/O1CN011QiAAGzyvsvM9H8_!!6000000002009-0-miaocare.jpg"],"submit_time":"2018-10-22 22:51:00"}],"service_code":"电子门锁安装","parent_biz_order_id":244331136979856056,"submit_time":"2018-10-22 22:51:00","biz_order_id":244331136980856056},"anomaly_recourse_id":163474}

public class AnomalyInfo {
    /**
     * result : {"buyer_nick":"batiqs","id":163474,"question_content":"拒绝安装/安装服务未完成","workcard_id":77010009,"question_type":"075","status":1,"service_order_id":244331136981856056,"recourse_message_list":[{"recourse_text":"购买前与客服明确过本地可安装才拍下商品，期间销售方还电话确认过安装地址。商品到达后却告知本地>无法安装，让寄回商品。因为销售方的不负责，导致本人错失活动期间选择其他商品的机会。特此请求平台方予以介入，给本人一个妥善的处理方式，本人不同意无条件退货，销售方必须为自己不负责的行为负责。","image_urls":["//img.alicdn.com/imgextra/i2/6000000004521/O1CN011jGf5A2VM9nhPIk_!!6000000004521-0-miaocare.jpg","//img.alicdn.com/imgextra/i4/6000000007662/O1CN0126TF7oT36UwGEuN_!!6000000007662-0-miaocare.jpg","//img.alicdn.com/imgextra/i2/6000000002009/O1CN011QiAAGzyvsvM9H8_!!6000000002009-0-miaocare.jpg"],"submit_time":"2018-10-22 22:51:00"}],"service_code":"电子门锁安装","parent_biz_order_id":244331136979856056,"submit_time":"2018-10-22 22:51:00","biz_order_id":244331136980856056}
     * anomaly_recourse_id : 163474
     */

    private ResultBean result;
    private int anomaly_recourse_id;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getAnomaly_recourse_id() {
        return anomaly_recourse_id;
    }

    public void setAnomaly_recourse_id(int anomaly_recourse_id) {
        this.anomaly_recourse_id = anomaly_recourse_id;
    }

    public static class ResultBean {
        /**
         * buyer_nick : batiqs
         * id : 163474
         * question_content : 拒绝安装/安装服务未完成
         * workcard_id : 77010009
         * question_type : 075
         * status : 1
         * service_order_id : 244331136981856056
         * recourse_message_list : [{"recourse_text":"购买前与客服明确过本地可安装才拍下商品，期间销售方还电话确认过安装地址。商品到达后却告知本地>无法安装，让寄回商品。因为销售方的不负责，导致本人错失活动期间选择其他商品的机会。特此请求平台方予以介入，给本人一个妥善的处理方式，本人不同意无条件退货，销售方必须为自己不负责的行为负责。","image_urls":["//img.alicdn.com/imgextra/i2/6000000004521/O1CN011jGf5A2VM9nhPIk_!!6000000004521-0-miaocare.jpg","//img.alicdn.com/imgextra/i4/6000000007662/O1CN0126TF7oT36UwGEuN_!!6000000007662-0-miaocare.jpg","//img.alicdn.com/imgextra/i2/6000000002009/O1CN011QiAAGzyvsvM9H8_!!6000000002009-0-miaocare.jpg"],"submit_time":"2018-10-22 22:51:00"}]
         * service_code : 电子门锁安装
         * parent_biz_order_id : 244331136979856056
         * submit_time : 2018-10-22 22:51:00
         * biz_order_id : 244331136980856056
         */

        private String buyer_nick;
        private int id;
        private String question_content;
        private int workcard_id;
        private String question_type;
        private int status;
        private long service_order_id;
        private String service_code;
        private long parent_biz_order_id;
        private String submit_time;
        private long biz_order_id;
        private List<RecourseMessageListBean> recourse_message_list;

        public String getBuyer_nick() {
            return buyer_nick;
        }

        public void setBuyer_nick(String buyer_nick) {
            this.buyer_nick = buyer_nick;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getQuestion_content() {
            return question_content;
        }

        public void setQuestion_content(String question_content) {
            this.question_content = question_content;
        }

        public int getWorkcard_id() {
            return workcard_id;
        }

        public void setWorkcard_id(int workcard_id) {
            this.workcard_id = workcard_id;
        }

        public String getQuestion_type() {
            return question_type;
        }

        public void setQuestion_type(String question_type) {
            this.question_type = question_type;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public long getService_order_id() {
            return service_order_id;
        }

        public void setService_order_id(long service_order_id) {
            this.service_order_id = service_order_id;
        }

        public String getService_code() {
            return service_code;
        }

        public void setService_code(String service_code) {
            this.service_code = service_code;
        }

        public long getParent_biz_order_id() {
            return parent_biz_order_id;
        }

        public void setParent_biz_order_id(long parent_biz_order_id) {
            this.parent_biz_order_id = parent_biz_order_id;
        }

        public String getSubmit_time() {
            return submit_time;
        }

        public void setSubmit_time(String submit_time) {
            this.submit_time = submit_time;
        }

        public long getBiz_order_id() {
            return biz_order_id;
        }

        public void setBiz_order_id(long biz_order_id) {
            this.biz_order_id = biz_order_id;
        }

        public List<RecourseMessageListBean> getRecourse_message_list() {
            return recourse_message_list;
        }

        public void setRecourse_message_list(List<RecourseMessageListBean> recourse_message_list) {
            this.recourse_message_list = recourse_message_list;
        }

        public static class RecourseMessageListBean {
            /**
             * recourse_text : 购买前与客服明确过本地可安装才拍下商品，期间销售方还电话确认过安装地址。商品到达后却告知本地>无法安装，让寄回商品。因为销售方的不负责，导致本人错失活动期间选择其他商品的机会。特此请求平台方予以介入，给本人一个妥善的处理方式，本人不同意无条件退货，销售方必须为自己不负责的行为负责。
             * image_urls : ["//img.alicdn.com/imgextra/i2/6000000004521/O1CN011jGf5A2VM9nhPIk_!!6000000004521-0-miaocare.jpg","//img.alicdn.com/imgextra/i4/6000000007662/O1CN0126TF7oT36UwGEuN_!!6000000007662-0-miaocare.jpg","//img.alicdn.com/imgextra/i2/6000000002009/O1CN011QiAAGzyvsvM9H8_!!6000000002009-0-miaocare.jpg"]
             * submit_time : 2018-10-22 22:51:00
             */

            private String recourse_text;
            private String submit_time;
            private List<String> image_urls;

            public String getRecourse_text() {
                return recourse_text;
            }

            public void setRecourse_text(String recourse_text) {
                this.recourse_text = recourse_text;
            }

            public String getSubmit_time() {
                return submit_time;
            }

            public void setSubmit_time(String submit_time) {
                this.submit_time = submit_time;
            }

            public List<String> getImage_urls() {
                return image_urls;
            }

            public void setImage_urls(List<String> image_urls) {
                this.image_urls = image_urls;
            }
        }
    }
}
