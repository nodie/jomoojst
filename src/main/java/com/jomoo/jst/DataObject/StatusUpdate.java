package com.jomoo.jst.DataObject;

//{"workcard_id":75822130,"Tp_id":2468433189,"status":16,"update_date":"2018-10-19 09:03:08","type":1,"comments":"null"}

public class StatusUpdate {
    /**
     * workcard_id : 77845028
     * Tp_id : 2468433189
     * status : 12
     * update_date : 2018-10-25 14:47:15
     * type : 1
     * comments : null
     */

    private int workcard_id;
    private long Tp_id;
    private int status;
    private String update_date;
    private int type;
    private String comments;

    public int getWorkcard_id() {
        return workcard_id;
    }

    public void setWorkcard_id(int workcard_id) {
        this.workcard_id = workcard_id;
    }

    public long getTp_id() {
        return Tp_id;
    }

    public void setTp_id(long Tp_id) {
        this.Tp_id = Tp_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}
