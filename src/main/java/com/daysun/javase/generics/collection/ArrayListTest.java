package com.daysun.javase.generics.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/9/23.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");

        for(int i=0;i<list.size();i++){
            String value=list.get(i);
            System.out.println(value);
        }

        for(Iterator<String> iter = list.iterator(); iter.hasNext();){
            String value=iter.next();
            System.out.println(value);
        }
    }
}
