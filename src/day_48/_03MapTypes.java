package day_48;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03MapTypes {

    public static void main(String[] args) {

        // HashMap hat keine Ordnung
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Süreyya",1);
        hashMap.put("Blagoja",2);
        hashMap.put("Vadim",3);
        hashMap.put("Mehmet",4);
        hashMap.put(null, null);
        hashMap.put(null, 5);

        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }

        System.out.println("***********************");

        // HashMap hat eine Ordnung je nach Einfügung
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Süreyya",1);
        linkedHashMap.put("Blagoja",2);
        linkedHashMap.put("Vadim",3);
        linkedHashMap.put("Mehmet",4);
        linkedHashMap.put(null, null);
        linkedHashMap.put(null, 5);

        for (Map.Entry<String, Integer> map : linkedHashMap.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }

        System.out.println("***********************");

        // HashMap hat eine naturelle (ASCII Table) Ordnung
        // TreeMap erlaubt null key oder value nicht
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Süreyya",1);
        treeMap.put("Blagoja",2);
        treeMap.put("Vadim",3);
        treeMap.put("Mehmet",4);

//        treeMap.put(null, null); unchecked Exception
//        treeMap.put(null, 5);

        for (Map.Entry<String, Integer> map : treeMap.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }

        System.out.println("treeMap.firstEntry() = " + treeMap.firstEntry());
        System.out.println("treeMap.lastEntry() = " + treeMap.lastEntry());

        System.out.println("treeMap.ceilingKey(\"N\") = " + treeMap.ceilingKey("N"));
        System.out.println("treeMap.floorKey(\"N\") = " + treeMap.floorKey("N"));

        Map.Entry<String, Integer> floorEntry = treeMap.floorEntry("F");

        System.out.println("floorEntry.getKey() = " + floorEntry.getKey());
        System.out.println("floorEntry.getValue() = " + floorEntry.getValue());

        System.out.println("treeMap.headMap(\"N\") = " + treeMap.headMap("N"));

        System.out.println("treeMap.tailMap(\"N\") = " + treeMap.tailMap("N"));


    }
}
