package com.jomoo.jst;

import net.sf.json.JSONObject;

/**
 * 更新工单状态
 *
 * @author nodie
 * @Time 2018-10-12 11:50:44
 */
public class DataObjectStatusUpdate {
    private String workcardidString;    //工单id
    private String tpidString;          //服务提供商id
    private int status;                 //状态,0:订单已退货，1:订单已签收，2:订单已拒签
    private int type;                   //工单类型,固定值:1
    private String updatadateString;    //跟新时间
    private String commentsString;      //备注

    // {"workcard_id":46347333,"Tp_id":3103721290,"status":16,"update_date":"2018-03-16 11:31:28","type":1,"comments":"null"}
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

    public String getCommentsString() {
        return commentsString;
    }

    public void setCommentsString(String commentsString) {
        this.commentsString = commentsString;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTpidString() {
        return tpidString;
    }

    public void setTpidString(String tpidString) {
        this.tpidString = tpidString;
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

    public String getWorkcardidString() {
        return workcardidString;
    }

    public void setWorkcardidString(String workcardidString) {
        this.workcardidString = workcardidString;
    }
}


