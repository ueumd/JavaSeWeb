package com.daysun.javase.generics.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2016/9/23.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("a","aa");
        map.put("b","bbb");
        map.put("c","cccc");

        Set<String> set=map.keySet();
        for(Iterator<String> iter=set.iterator();iter.hasNext();){
            String key=iter.next();
            String value=map.get(key);

            System.out.println(key+" : "+value);
        }
    }
}
