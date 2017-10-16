package practice.ch11;

import util.TextFile;

import java.util.*;

public class Practice21 {
    public static void main(String[] args) {
        Set<String> words =
                new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(
                new TextFile("src/confuse/ch11/SetOperations.java", "\\W+")
        );
        List<String> s = new TextFile("src/confuse/ch11/SetOperations.java", "\\W+");
        Map<String, Integer> map = new HashMap<>();
        for (String str : s) {
            map.put(str, map.get(str) == null ? 1 : map.get(str) + 1);
        }
        Collections.sort(s, String.CASE_INSENSITIVE_ORDER);
//        System.out.println(words);
        System.out.println(map);
    }
}
