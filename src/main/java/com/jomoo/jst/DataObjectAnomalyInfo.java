package com.jomoo.jst;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class DataObjectAnomalyInfo {

		private String uid;
		private String buyer_nick;
		private String anomalyid;
		private String workcard_id;
		private String question_type;
		private String status;
		private String recourse_text;
		private String image_urls;
		private String service_code;
		private String parent_biz_order_id;
		private String submit_time;
		private String recourse_message_list;

		public DataObjectAnomalyInfo() {
		}

		public String getUid() {
			return uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getBuyer_nick() {
			return buyer_nick;
		}

		public void setBuyer_nick(String buyer_nick) {
			this.buyer_nick = buyer_nick;
		}

		public String getAnomalyid() {
			return anomalyid;
		}

		public void setAnomalyid(String anomalyid) {
			this.anomalyid = anomalyid;
		}

		public String getWorkcard_id() {
			return workcard_id;
		}

		public void setWorkcard_id(String workcard_id) {
			this.workcard_id = workcard_id;
		}

		public String getQuestion_type() {
			return question_type;
		}

		public void setQuestion_type(String question_type) {
			this.question_type = question_type;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRecourse_text() {
			return recourse_text;
		}

		public void setRecourse_text(String recourse_text) {
			this.recourse_text = recourse_text;
		}

		public String getImage_urls() {
			return image_urls;
		}

		public void setImage_urls(String image_urls) {
			this.image_urls = image_urls;
		}

		public String getService_code() {
			return service_code;
		}

		public void setService_code(String service_code) {
			this.service_code = service_code;
		}

		public String getParent_biz_order_id() {
			return parent_biz_order_id;
		}

		public void setParent_biz_order_id(String parent_biz_order_id) {
			this.parent_biz_order_id = parent_biz_order_id;
		}

		public String getSubmit_time() {
			return submit_time;
		}

		public void setSubmit_time(String submit_time) {
			this.submit_time = submit_time;
		}

		public String getRecourse_message_list() {
			return recourse_message_list;
		}

		public void setRecourse_message_list(String recourse_message_list) {
			this.recourse_message_list = recourse_message_list;
		}
		
		
		/**
		 * 格式化 json 成为 DataAnomalyInfo 对象
		 * 
		 * @param jsonString
		 * @return DataObjectAnomalyInfo
		 */
		public DataObjectAnomalyInfo jsonToDataAnomalyInfo(String jsonString) {
			DataObjectAnomalyInfo dataObject = new DataObjectAnomalyInfo();
			
			JSONObject resultJsonObject = JSONObject.fromObject(JSONObject.fromObject(jsonString).getString("result"));
			dataObject.setBuyer_nick(resultJsonObject.getString("buyer_nick"));
			dataObject.setAnomalyid(resultJsonObject.getString("id"));
			dataObject.setWorkcard_id(resultJsonObject.getString("workcard_id"));
			dataObject.setQuestion_type(resultJsonObject.getString("question_type"));
			dataObject.setStatus(resultJsonObject.getString("status"));
			dataObject.setRecourse_message_list(resultJsonObject.getString("recourse_message_list"));
			dataObject.setService_code(resultJsonObject.getString("service_code"));
			dataObject.setParent_biz_order_id(resultJsonObject.getString("parent_biz_order_id"));
			dataObject.setSubmit_time(resultJsonObject.getString("submit_time"));
			
			
			String recourse_message_list = dataObject.getRecourse_message_list();
			//System.out.println(recourse_message_list);
			JSONArray recourseJsonArray = JSONArray.fromObject(recourse_message_list);
			//System.out.println(recourseJsonArray.getString(0));
			JSONObject recourseJsonObject = JSONObject.fromObject(recourseJsonArray.getString(0));
			dataObject.setRecourse_text(recourseJsonObject.getString("recourse_text"));
			
			JSONArray imageUrlJsonArray = JSONArray.fromObject(dataObject.getImage_urls());
			dataObject.setImage_urls(imageUrlJsonArray.getString(0));
			
			return dataObject;
		}
		
}
