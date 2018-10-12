package com.jomoo.jst;

import com.taobao.api.internal.tmc.Message;
import com.taobao.api.internal.tmc.TmcClient;
import com.taobao.api.internal.tmc.MessageHandler;  
import com.taobao.api.internal.tmc.MessageStatus;
import com.taobao.api.internal.toplink.LinkException;

/**
 * 
 * @author landiyu
 * 
 * 使用线程，通过聚石塔接口，获取工单的各种状态信息
 *
 */
public class ClientThread extends Thread{
	
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
		System.out.println("Running " + threadName + " UID_INTEGER="+ uid + " NICK="+ nickString + " APPKEY_STRING="+ appkeyString + " SECRET_STRING=" + secretString);
		System.out.println("Thread " + threadName + " exiting.");
		
		TmcClient client = new TmcClient(appkeyString, secretString, "default"); // 关于default参考消息分组说明

		while (true) {
			client.setMessageHandler(new MessageHandler() {
			    public void onMessage(Message message, MessageStatus status) {
			        try {


			    		
			    		/**
			    		 * 新的工单
			    		 */
			            if (message.getTopic().equals("tmall_fuwu_WorkcardInfo")) {
				            //System.out.println("getContent: " + message.getContent());
				            //System.out.println("getTopic:" + message.getTopic());
				            //System.out.println("getId:" + message.getId());

			            	System.out.println("UID_INTEGER="+ uid + " APPKEY_STRING="+ appkeyString + " SECRET_STRING=" + secretString);
			            	System.out.println("\n--------------------------------------------------------\n");
			            	System.out.println("getId: " + message.getId() + "\n");
			            	System.out.println("getTopic: " + message.getTopic() + "\n");
			            	System.out.println("getContent: " + message.getContent() + "\n");
			            	System.out.println("\n========================================================\n\n\n\n\n");
			            	
			            	
				            String contentString = message.getContent();
				            
				    	    DataObjectOrderInfo dataObject = new DataObjectOrderInfo();
				    	    
				    		dataObject = dataObject.jsonToDataOrderInfo(contentString);

						}
			            
			            /**
			             * 一键求助单
			             */
			            if (message.getTopic().equals("tmall_fuwu_AnomalyRecourse")) {
			            	
			            	System.out.println("UID_INTEGER="+ uid + " APPKEY_STRING="+ appkeyString + " SECRET_STRING=" + secretString);
			            	System.out.println("\n--------------------------------------------------------\n");
			            	System.out.println("getId: " + message.getId() + "\n");
			            	System.out.println("getTopic: " + message.getTopic() + "\n");
			            	System.out.println("getContent: " + message.getContent() + "\n");
			            	System.out.println("\n========================================================\n\n\n\n\n");
			            	
			            	

				            String contentString = message.getContent();
				            
				    	    DataObjectAnomalyInfo dataObject = new DataObjectAnomalyInfo();
				    	    
				    	    dataObject = dataObject.jsonToDataAnomalyInfo(contentString);

						}
			            
			            /**
			             * 更新工单状态
			             */
			            if (message.getTopic().equals("tmall_fuwu_WorkcardStatusUpdate")) {

			            	System.out.println("UID_INTEGER="+ uid + " APPKEY_STRING="+ appkeyString + " SECRET_STRING=" + secretString);
			            	System.out.println("\n--------------------------------------------------------\n");
			            	System.out.println("getId: " + message.getId() + "\n");
			            	System.out.println("getTopic: " + message.getTopic() + "\n");
			            	System.out.println("getContent: " + message.getContent() + "\n");
			            	System.out.println("\n========================================================\n\n\n\n\n");
			            	
			            	String contentString = message.getContent();
			            	
			            	DataObjectStatusUpdate dataObject = new DataObjectStatusUpdate();
			            	
			            	dataObject = dataObject.jsonToDataStatusUpdate(contentString);

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
