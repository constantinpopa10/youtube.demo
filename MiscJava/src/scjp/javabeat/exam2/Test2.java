package scjp.javabeat.exam2;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class Test2{
    public static void main(String a[]){
        Map<Object, Object> hashTable = new Hashtable<Object, Object>();
        Map hashMap = new HashMap();
        Map concurrHashMap = new ConcurrentHashMap();
        //hashTable.put(null,null);
        hashMap.put(null, null);
        hashMap.put(null, null);
        //concurrHashMap.put(null, null);
        System.out.println(hashMap.get(null));
    }
}