package com.jomoo.jst.Redis;

import redis.clients.jedis.Jedis;

import java.util.*;

public class RedisUtil {

    public static Jedis jedis;

    public static void init() {
        //连接服务器
        jedis = new Jedis("127.0.0.1", 6379);
        //权限认证
        jedis.auth("baogongpo.cn");
        //选择 index=1
        jedis.select(1);

    }

    public static void main(String[] args) {
        init();
        Map<String, String> map = new HashMap<String, String>() {
            {
                put("Tp_id", "2468433189");
                put("status", "16");
                put("update_date", "2018-10-19 09:03:08");
                put("type", "1");
                put("comments", "null");
            }
        };

        setMapValue("75822130", map);

        getAllMapKeys();

    }


    public static void setValue(String key, String value) {
        jedis.set(key, value);
    }

    public static String getValue(String key) {
        return jedis.get(key);
    }

    public static void delValue(String key) {
        jedis.del(key);
    }

    public static Set getAllKeys() {
        Set s = jedis.keys("*");
        return s;
    }

    private static void getAllStringKeys() {
        Set s = jedis.keys("*");
        Iterator it = s.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            if (jedis.type(key).equals("string")) {
                String value = jedis.get(key);
                System.out.println(key + value + "#\n");
            }
        }
    }

    private static Set getAllMapKeys() {
        Set s = jedis.keys("*");
        Iterator it = s.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            if (jedis.type(key).equals("hash")) {
                List<String> list = jedis.hmget(key, "Tp_id", "status");
                System.out.println("key:" + key + " v1:" + list.get(0) +" v2:" + list.get(1));
            }
        }

        return s;
    }

    public static void setMapValue(String tb_id, Map<String, String> updateMap) {
        Map<String, String> map = new HashMap<>();

        map.put("Tp_id", updateMap.get("Tp_id"));
        map.put("status", updateMap.get("status"));
        map.put("update_date", updateMap.get("update_date"));
        map.put("type", updateMap.get("type"));
        map.put("comments", updateMap.get("comments"));
        jedis.hmset(tb_id, map);
    }


}
