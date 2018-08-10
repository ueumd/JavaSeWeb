package com.daysun.javase.collection.map;

import java.util.HashMap;
import java.util.Map;

/*
 * 需求：我想把学号和学生姓名一一对应存储，将来通过学号获取学生姓名。
 * 要实现这种功能，目前所学的集合不太适合。因为这种数据是具有一一对应关系，而且是成对的。
 * 所以，为了满足这种需要，java就提供了一种新的集合：Map。
 * Map:
 * 		Map集合存储的元素是成对出现的。这个成对出现的数据被称为键值对。(可以把他理解为夫妻)
 * 				前面我们学过的集合Collection体系，只能存储单独的元素。(可以把他理解为光棍)
 *		Map集合的键必须是唯一的。
 *		值可以重复，但是键必须只有一个。
 *
 * Map集合的数据结构对谁有效?
 * 		只对键有效，跟值无关。
 *
 * Map的功能：
 * 1：添加功能
 * 		V put(K key, V value):如果键是第一次被存储，就是添加功能。如果键已经在集合中存在，就是替换功能。
 * 2：删除功能
 * 		void clear()：清除集合中的所有键值对元素。
 * 		V remove(Object key):根据指定的键删除键值对元素，并把值返回。
 * 3：判断功能
 * 		boolean containsKey(Object key):判断集合中是否有指定的键。
 * 		boolean containsValue(Object value):判断集合中是否有指定的值。
 * 		boolean isEmpty():判断集合是否为空。
 * 4：获取功能
 * 		Set<Map.Entry<K,V>> entrySet():返回的是键值对对象的集合。
 * 		V get(Object key):根据指定的键找到对应的值。
 * 		Set<K> keySet():返回键的Set集合。
 * 		Collection<V> values():返回值的Collection集合。
 * 5：长度功能
 * 		int size()：返回集合中键值对的对数。
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();

        map.put("name","zs");
        map.put("age","20");

        System.out.println(map.put("city","beijing")); //返回null

        System.out.println(map.get("age"));
        System.out.println(map);

    }
}
