package com.jomoo.jst;

import com.google.gson.Gson;
import com.jomoo.jst.DataObject.AnomalyInfo;
import com.jomoo.jst.DataObject.OrderInfo;
import com.jomoo.jst.DataObject.SignCreate;
import com.jomoo.jst.DataObject.StatusUpdate;
import com.taobao.api.internal.tmc.Message;
import com.taobao.api.internal.tmc.TmcClient;
import com.taobao.api.internal.tmc.MessageHandler;
import com.taobao.api.internal.tmc.MessageStatus;
import com.taobao.api.internal.toplink.LinkException;
import org.joda.time.DateTime;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.UUID;

/**
 * @author landiyu
 * 
 * 使用线程，通过聚石塔接口，获取工单的各种状态信息
 */
public class ClientThread extends Thread {

    private int uid;
    private String appkeyString;
    private String secretString;
    private String nickString;

    private Thread t;
    private String threadName;


    ClientThread(String name, int id, String appkey, String secret, String nick) {
        threadName = name;
        uid = id;
        appkeyString = appkey;
        secretString = secret;
        nickString = nick;

        this.setName(nickString);

        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName + " UID_INTEGER=" + uid + " NICK=" + nickString + " APPKEY_STRING=" + appkeyString + " SECRET_STRING=" + secretString);
        System.out.println("Thread " + threadName + " exiting.");

        TmcClient client = new TmcClient(appkeyString, secretString, "default"); // 关于default参考消息分组说明
        Gson gson = new Gson();
        String SignatureNonce = UUID.randomUUID().toString();
        String Timestamp = new DateTime().toString("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);
        SendPost sendPost = new SendPost();

        while (true) {
            client.setMessageHandler(new MessageHandler() {
                public void onMessage(Message message, MessageStatus status) {
                    try {

                        Tools.writeLogs(JomooJst.LOGFILE_STRING, "UID_INTEGER="+ uid + " APPKEY_STRING="+ appkeyString + " SECRET_STRING=" + secretString);
                        Tools.writeLogs(JomooJst.LOGFILE_STRING, "\n--------------------------------------------------------\n");
                        Tools.writeLogs(JomooJst.LOGFILE_STRING, "NICK: " + nickString + "\n");
                        Tools.writeLogs(JomooJst.LOGFILE_STRING, "getId: " + message.getId() + "\n");
                        Tools.writeLogs(JomooJst.LOGFILE_STRING, "getTopic: " + message.getTopic() + "\n");
                        Tools.writeLogs(JomooJst.LOGFILE_STRING, "getContent: " + message.getContent() + "\n");
                        Tools.writeLogs(JomooJst.LOGFILE_STRING, "getPubAppKey: " + message.getPubAppKey() + "\n");
                        Tools.writeLogs(JomooJst.LOGFILE_STRING, "getUserNick: " + message.getUserNick() + "\n");
                        Tools.writeLogs(JomooJst.LOGFILE_STRING, "getOutgoingTime: " + message.getOutgoingTime() + "\n");
                        Tools.writeLogs(JomooJst.LOGFILE_STRING, "getPubTime: " + message.getPubTime() + "\n");
                        Tools.writeLogs(JomooJst.LOGFILE_STRING, "getUserId: " + message.getUserId() + "\n");
                        Tools.writeLogs(JomooJst.LOGFILE_STRING, "\n========================================================\n\n\n\n\n");


                        /**
                         * 新的工单
                         */
                        if (message.getTopic().equals("tmall_fuwu_WorkcardInfo")) {
                            //System.out.println("getContent: " + message.getContent());
                            //System.out.println("getTopic:" + message.getTopic());
                            //System.out.println("getId:" + message.getId());

                            System.out.println("UID_INTEGER=" + uid + " APPKEY_STRING=" + appkeyString + " SECRET_STRING=" + secretString);
                            System.out.println("\n--------------------------------------------------------\n");
                            System.out.println("getId: " + message.getId() + "\n");
                            System.out.println("getTopic: " + message.getTopic() + "\n");
                            System.out.println("getContent: " + message.getContent() + "\n");
                            System.out.println("\n========================================================\n\n\n\n\n");


                            String contentString = message.getContent();

                            try {
                                OrderInfo orderInfo = gson.fromJson(contentString, OrderInfo.class);
                                sendPost.setMessageObj(SignatureNonce, Timestamp, message.getTopic(), orderInfo);
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                            }

                            //DataObjectOrderInfo dataObject = new DataObjectOrderInfo();
                            //dataObject = dataObject.jsonToDataOrderInfo(contentString);

                        }

                        /**
                         * 一键求助单
                         */
                        if (message.getTopic().equals("tmall_fuwu_AnomalyRecourse")) {

                            System.out.println("UID_INTEGER=" + uid + " APPKEY_STRING=" + appkeyString + " SECRET_STRING=" + secretString);
                            System.out.println("\n--------------------------------------------------------\n");
                            System.out.println("getId: " + message.getId() + "\n");
                            System.out.println("getTopic: " + message.getTopic() + "\n");
                            System.out.println("getContent: " + message.getContent() + "\n");
                            System.out.println("\n========================================================\n\n\n\n\n");


                            String contentString = message.getContent();

                            try {
                                AnomalyInfo anomalyInfo = gson.fromJson(contentString, AnomalyInfo.class);
                                sendPost.setMessageObj(SignatureNonce, Timestamp, message.getTopic(), anomalyInfo);
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                            }

                            //DataObjectAnomalyInfo dataObject = new DataObjectAnomalyInfo();
                            //dataObject = dataObject.jsonToDataAnomalyInfo(contentString);

                        }

                        /**
                         * 更新工单状态
                         */
                        if (message.getTopic().equals("tmall_fuwu_WorkcardStatusUpdate")) {

                            System.out.println("UID_INTEGER=" + uid + " APPKEY_STRING=" + appkeyString + " SECRET_STRING=" + secretString);
                            System.out.println("\n--------------------------------------------------------\n");
                            System.out.println("getId: " + message.getId() + "\n");
                            System.out.println("getTopic: " + message.getTopic() + "\n");
                            System.out.println("getContent: " + message.getContent() + "\n");
                            System.out.println("\n========================================================\n\n\n\n\n");

                            String contentString = message.getContent();
                            try {
                                StatusUpdate statusUpdate = gson.fromJson(contentString, StatusUpdate.class);
                                sendPost.setMessageObj(SignatureNonce, Timestamp, message.getTopic(), statusUpdate);
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                            }

                            //DataObjectStatusUpdate dataObject = new DataObjectStatusUpdate();
                            //dataObject = dataObject.jsonToDataStatusUpdate(contentString);

                        }

                        /**
                         * 签到
                         */
                        if (message.getTopic().equals("tmall_serviceplatform_SignCreate")) {

                            System.out.println("UID_INTEGER=" + uid + " APPKEY_STRING=" + appkeyString + " SECRET_STRING=" + secretString);
                            System.out.println("\n--------------------------------------------------------\n");
                            System.out.println("getId: " + message.getId() + "\n");
                            System.out.println("getTopic: " + message.getTopic() + "\n");
                            System.out.println("getContent: " + message.getContent() + "\n");
                            System.out.println("\n========================================================\n\n\n\n\n");

                            String contentString = message.getContent();
                            try {
                                SignCreate signCreate = gson.fromJson(contentString, SignCreate.class);
                                sendPost.setMessageObj(SignatureNonce, Timestamp, message.getTopic(), signCreate);
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                            }

                            //DataObjectStatusUpdate dataObject = new DataObjectStatusUpdate();
                            //dataObject = dataObject.jsonToDataStatusUpdate(contentString);

                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                        status.fail(); // 消息处理失败回滚，服务端需要重发
                        // 重试注意：不是所有的异常都需要系统重试。
                        // 对于字段不全、主键冲突问题，导致写DB异常，不可重试，否则消息会一直重发
                        // 对于，由于网络问题，权限问题导致的失败，可重试。
                        // 重试时间 5分钟不等，不要滥用，否则会引起雪崩
                    }
                }
            });

            try {
                client.connect(JomooJst.WS_STRING);
            } catch (LinkException e) {
                e.printStackTrace();
            }

            //System.out.println("end.");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
