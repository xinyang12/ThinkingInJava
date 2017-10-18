package practice.ch11;

import java.util.*;

/**
 * 利用TreeMap进行排序
 */
public class Ex24 {
    public static void main(String[] args) {
        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("ten", 10);
        m.put("nine", 9);
        m.put("eight", 8);
        m.put("seven", 7);
        m.put("six", 6);
        m.put("five", 5);
        m.put("four", 4);
        m.put("three", 3);
        m.put("two", 2);
        m.put("one", 1);
        m.put("zero", 0);
        System.out.println("Map to sort: " + m);
        Map<String, Integer> mTemp = new LinkedHashMap<>();
        // 先把原键值存储起来
        Set<String> ss = new TreeSet<String>(m.keySet());
        Iterator<String> itss = ss.iterator();
        // 然后遍历键值
        // 存储到一个临时的map中
        while (itss.hasNext()) {
            String s = (String) itss.next();
            Integer i = m.get(s);
            m.remove(s);
            mTemp.put(s, i);
        }
        Set<String> ssTemp = new TreeSet<>(mTemp.keySet());
        Iterator<String> itssTemp = ssTemp.iterator();
        while (itssTemp.hasNext()) {
            String s = (String)itssTemp.next();
            Integer i = mTemp.get(s);
            mTemp.remove(s);
            m.put(s, i);
        }

        mTemp.clear();
        System.out.println("Sorted map: " + m);
    }
}
