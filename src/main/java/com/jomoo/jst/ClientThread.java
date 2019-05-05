package com.jomoo.jst;

import com.google.gson.Gson;
import com.jomoo.jst.DataObject.*;
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

                        Tools.writeLogs("UID_INTEGER="+ uid + " APPKEY_STRING="+ appkeyString + " SECRET_STRING=" + secretString);
                        Tools.writeLogs("\n--------------------------------------------------------\n");
                        Tools.writeLogs("NICK: " + nickString + "\n");
                        Tools.writeLogs("getId: " + message.getId() + "\n");
                        Tools.writeLogs("getTopic: " + message.getTopic() + "\n");
                        Tools.writeLogs("getContent: " + message.getContent() + "\n");
                        Tools.writeLogs("getPubAppKey: " + message.getPubAppKey() + "\n");
                        Tools.writeLogs("getUserNick: " + message.getUserNick() + "\n");
                        Tools.writeLogs("getOutgoingTime: " + message.getOutgoingTime() + "\n");
                        Tools.writeLogs("getPubTime: " + message.getPubTime() + "\n");
                        Tools.writeLogs("getUserId: " + message.getUserId() + "\n");
                        Tools.writeLogs("\n========================================================\n\n\n\n\n");


                        /**
                         * 新的工单
                         */
                        if (message.getTopic().equals("tmall_fuwu_WorkcardInfo")) {

                            systemOut(message);


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

                            systemOut(message);


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

                            systemOut(message);

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

                            systemOut(message);

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

                        /**
                         * 监控日志
                         */
                        if (message.getTopic().equals("tmall_fuwu_ServiceMonitorMessage")) {
                            systemOut(message);


                            String contentString = message.getContent();

                            try {
                                ServiceMonitorMessage serviceMonitorMessage = gson.fromJson(contentString, ServiceMonitorMessage.class);
                                sendPost.setMessageObj(SignatureNonce, Timestamp, message.getTopic(), serviceMonitorMessage);
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                            }
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                        status.fail();
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

    private void systemOut(Message message) {
        System.out.println("UID_INTEGER=" + uid + " APPKEY_STRING=" + appkeyString + " SECRET_STRING=" + secretString);
        System.out.println("\n--------------------------------------------------------\n");
        System.out.println("getId: " + message.getId() + "\n");
        System.out.println("getTopic: " + message.getTopic() + "\n");
        System.out.println("getContent: " + message.getContent() + "\n");
        System.out.println("\n========================================================\n\n\n\n\n");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
