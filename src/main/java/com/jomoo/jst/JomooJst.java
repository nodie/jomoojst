
/**
 *
 */
package com.jomoo.jst;

import java.util.HashMap;
import java.util.Map;

/**
 * 天猫账号资料
 */
class ApiObject {
    int uid;           // 用户 ID
    String nick;          // 用户昵称
    String tpid;          // 淘宝的 tpid
    String appkey;        // appkey
    String secretKey;     // secretKey
    String sessionKey;    // sessionKey
    int status;        // 状态
}


public class JomooJst {
    static String WS_STRING = "ws://mc.api.taobao.com";
    static final String LOGFILE_STRING = "logs/jomoo-jst-logs.txt";

    // static String WS_STRING = "ws://mc.api.tbsandbox.com/";
    public static void main(String[] args) throws Throwable {
        Map<String, ClientThread> threadMap = new HashMap<String, ClientThread>();
        Map<Integer, ApiObject> apiMap = setDemoMap();

        for (Integer key : apiMap.keySet()) {
            final int uid = apiMap.get(key).uid;
            final String appkeyString = apiMap.get(key).appkey;
            final String secretString = apiMap.get(key).secretKey;
            final String nickString = apiMap.get(key).nick;
            final int status = apiMap.get(key).status;

            if (status != 1) {
                continue;
            }

            System.out.println("UID_INTEGER=" + uid + " NICK=" + nickString + " APPKEY_STRING=" + appkeyString
                    + " SECRET_STRING=" + secretString);

            ClientThread clientThread = new ClientThread(apiMap.get(key).tpid,
                    uid,
                    appkeyString,
                    secretString,
                    nickString);

            clientThread.start();
            threadMap.put(nickString, clientThread);
            Thread.sleep(50);
        }
    }

    private static Map<Integer, ApiObject> setDemoMap() {
        Map<Integer, ApiObject> apiMap = new HashMap<Integer, ApiObject>();

        // 通过字段检索
        ApiObject apiObject = new ApiObject();

        apiObject.uid = 9;
        apiObject.nick = "jiumu";
        apiObject.tpid = "2191428291";
        apiObject.appkey = "25040227";
        apiObject.secretKey = "37d5fd8814b73647f07e3dd1126ff03a";
        apiObject.sessionKey = "";
        apiObject.status = 1;
        apiMap.put(apiObject.uid, apiObject);

        return apiMap;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
