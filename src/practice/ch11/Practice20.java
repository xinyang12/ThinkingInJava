package practice.ch11;

import util.TextFile;

import java.util.*;

public class Practice20 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(
                new TextFile("src/confuse/ch11/SetOperations.java", "\\W+")
        );
        Set<Character> set = new HashSet<>();
//        set.add('A');
//        set.add('E');
//        set.add('I');
//        set.add('O');
//        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        Map<Character, Integer> answer = new HashMap<>();
        int allCount = 0;
        for (String s : words) {
            int count = 0;
            for (int i = 0; i < s.length(); ++i) {
//                if (set.contains(s.charAt(i))) {
//                    ++count;
//                    ++allCount;
//                }
                if (Character.toLowerCase(s.charAt(i)) == 'a') {
                    answer.put('a', answer.get('a') == null ? 1 : answer.get('a') + 1);
                } else if (Character.toLowerCase(s.charAt(i)) == 'e') {
                    answer.put('e', answer.get('e') == null ? 1 : answer.get('e') + 1);
                } else if (Character.toLowerCase(s.charAt(i)) == 'i') {
                    answer.put('i', answer.get('i') == null ? 1 : answer.get('i') + 1);
                } else if (Character.toLowerCase(s.charAt(i)) == 'o') {
                    answer.put('o', answer.get('o') == null ? 1 : answer.get('o') + 1);
                } else if (Character.toLowerCase(s.charAt(i)) == 'u') {
                    answer.put('u', answer.get('u') == null ? 1 : answer.get('u') + 1);
                }
            }
//            System.out.println(s + " and " + count);
        }
        System.out.println(answer);
//        System.out.println("all count is " + allCount);
    }
}
