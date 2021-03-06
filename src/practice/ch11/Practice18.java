package practice.ch11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice18 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        System.out.println(map);
        System.out.println(map.hashCode());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.hashCode());
            System.out.println("key");
            System.out.println(entry.getKey().hashCode());
            System.out.println("value");
            System.out.println(entry.getValue().hashCode());
        }
        System.out.println("linkedhashmap");
        Map<Integer, Integer> map2 = new LinkedHashMap<>(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.hashCode());
            System.out.println("key");
            System.out.println(entry.getKey().hashCode());
            System.out.println("value");
            System.out.println(entry.getValue().hashCode());
        }
    }
}
