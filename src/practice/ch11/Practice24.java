package practice.ch11;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Practice24 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("wang", 1);
        map.put("xin", 2);
        map.put("aang", 3);

        List<String> list = new LinkedList<>();
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            list.add(m.getKey());
        }
        Collections.sort(list);
        System.out.println("list is " );
        for (String s : list) {
            System.out.println(s);
        }
        map.clear();
        for (String s : list) {
            map.put(s, map.get(s));
        }
        System.out.println(map);
    }
}
