package com.jomoo.jst;

import net.sf.json.JSONObject;

public class DataObjectStatusUpdate {
	
	private String workcardidString;
	private String tpidString;
	private int status;
	private int type;
	private String updatadateString;
	private String commentsString;

	

	public String getWorkcardidString() {
		return workcardidString;
	}

	public void setWorkcardidString(String workcardidString) {
		this.workcardidString = workcardidString;
	}

	public String getTpidString() {
		return tpidString;
	}

	public void setTpidString(String tpidString) {
		this.tpidString = tpidString;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getUpdatadateString() {
		return updatadateString;
	}

	public void setUpdatadateString(String updatadateString) {
		this.updatadateString = updatadateString;
	}

	public String getCommentsString() {
		return commentsString;
	}

	public void setCommentsString(String commentsString) {
		this.commentsString = commentsString;
	}


	//{"workcard_id":46347333,"Tp_id":3103721290,"status":16,"update_date":"2018-03-16 11:31:28","type":1,"comments":"null"}
	

	
	public DataObjectStatusUpdate jsonToDataStatusUpdate(String jsonString) {
		DataObjectStatusUpdate dataObject = new DataObjectStatusUpdate();
		
		JSONObject resultJsonObject = JSONObject.fromObject(jsonString);
		dataObject.setWorkcardidString(resultJsonObject.getString("workcard_id"));
		dataObject.setTpidString(resultJsonObject.getString("Tp_id"));
		dataObject.setStatus(resultJsonObject.getInt("status"));
		dataObject.setUpdatadateString(resultJsonObject.getString("update_date"));
		dataObject.setType(resultJsonObject.getInt("type"));
		dataObject.setCommentsString(resultJsonObject.getString("comments"));
				
		return dataObject;
	}
}
