package com.daysun.javase.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/26.
 */
public class GernericMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word : args) {
           //map.get(word, (null == map.get(word)) ? 1 : map.get(word) + 1);
        }
    }
}
