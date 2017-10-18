package practice.ch11;

import util.TextFile;

import java.util.*;

/**
 * 单词位于第几个单词的位置
 */
public class Practice25 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        List<String> list = new TextFile("src/confuse/ch11/SetOperations.java", "\\W+");
        System.out.println(list);
        Iterator itWords = list.iterator();
        int count = 0;
        while (itWords.hasNext()) {
            String s = (String)itWords.next();
            ++count;
            if (!map.keySet().contains(s)) {
                ArrayList<Integer> ai = new ArrayList<>();
                ai.add(0, count);
                map.put(s, ai);
            } else {
                map.get(s).add(count);
                map.put(s, map.get(s));
            }
        }
        System.out.println(map);
    }
}
