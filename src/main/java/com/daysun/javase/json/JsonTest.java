package com.daysun.javase.json;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/23.
 */
public class JsonTest {
    public static void main(String[] args) {
        JSONObjectSimple();
        createJsonByMap();
    }

    private static void JSONObjectSimple() {
        JSONObject zs = new JSONObject();
        Object nullObj = null;

        zs.put("name", "张三");
        zs.put("age", 20);
        zs.put("birthdy", "1900-01-01");
        zs.put("major", new String[]{"理发", "挖掘机"});
        zs.put("gilrFriend", false);
        zs.put("car", nullObj);
        zs.put("house", nullObj);
        zs.put("school", "蓝翔");

        System.out.println(zs.toString());
    }

    private static void createJsonByMap() {
        Map<String, Object> ls = new HashMap<String, Object>();
        Object nullObj = null;

        ls.put("name", "张三");
        ls.put("age", 20);
        ls.put("birthdy", "1900-01-01");
        ls.put("major", new String[]{"理发", "挖掘机"});
        ls.put("gilrFriend", false);
        ls.put("car", nullObj);
        ls.put("house", nullObj);
        ls.put("school", "蓝翔");

        System.out.println(new JSONObject(ls).toString());
    }
}

