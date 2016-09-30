package com.daysun.javase.generics.base;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/9/27.
 */
public class GenricMethods {

    /**
     * 1.编写一个泛型方法，自动将Object类型对象转换为其他类型
     * @param <T>
     * @param obj
     * @return
     */

    public static  <T> T autoCover(Object obj){
        return (T)obj;
    }

    /**
     *  2.定义一个泛型方法，可以将任意类型的数组中的所有元素填充为相应类型的某个对象
     * @param <T>
     * @param array
     * @param obj
     */

    public static <T> void fillArray(T[] array,T obj){
        for(int i=0;i<array.length;i++){
            array[i]=obj;
        }

        printArray(array);
    }

    /**
     * 3.采用自定泛型方法的方式打印出任意参数化类型的集合中的所有内容
     * @param <T>
     * @param collection
     */

    private static <T> void printCollection(Collection<T> collection){
        System.out.println("\ncollection size is: "+collection.size());
        for(Object obj :collection){
            System.out.println(obj);
        }
    }


    /**
     * 4.定义一个泛型方法，把任意参数类型的集合中的数据安全地复制到相应类型的数组中
     * @param <T>
     * @param srcCollection
     * @param descArray
     */

    private static <T> void CollectionCopyToarray(Collection<T> srcCollection,T[] descArray){
        Iterator<T> it = srcCollection.iterator();
        int recordElementPostion=0;
        while(it.hasNext()){
            descArray[recordElementPostion]=it.next();
            recordElementPostion++;
        }
        printArray(descArray);
    }

    private static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.print(t + "\t");
        }
    }

    public static void main(String[] args) {
        String name="Hello";
        String value=autoCover(name);

        System.out.println(value);

        int i=20;
        System.out.println(autoCover(i));

        String[] array={"A","B","C"};
        fillArray(array,name);

        Collection<String> list=new ArrayList<String>();
        list.add("北京");
        list.add("上海");
        printCollection(list);

        String[] str=new String[list.size()];

        int[] inti=new int[list.size()];

        CollectionCopyToarray(list,str);  //北京	上海

      //  CollectionCopyToarray(inti,str); //报错
    }
}
