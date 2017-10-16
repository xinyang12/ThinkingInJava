package practice.ch11;

import util.TextFile;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Practice16 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(
                new TextFile("src/confuse/ch11/SetOperations.java", "\\W+")
        );
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int allCount = 0;
        for (String s : words) {
            int count = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (set.contains(s.charAt(i))) {
                    ++count;
                    ++allCount;
                }
            }
            System.out.println(s + " and " + count);
        }
        System.out.println("all count is " + allCount);
    }
}
