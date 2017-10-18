package practice.ch11;

import util.TextFile;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Practice22 {
    public static void main(String[] args) {
        List<String> s = new TextFile("src/confuse/ch11/SetOperations.java", "\\W+");
        Set<Prac22Word> answer = new HashSet<>();
        Prac22Word p = new Prac22Word();
        // 遍历list，如果
        for (String str : s) {
            boolean count = false;
            for (Prac22Word p2 : answer) {
                if (p2.getWord().equals(str)) {
                    p2.setCounter(p2.getCounter() + 1);
                    count = true;
                }
            }
            if (!count) {
                answer.add(new Prac22Word(str, 1));
            }
        }
        for (Prac22Word p3 : answer) {
            System.out.println(p3.getWord() + " and " + p3.getCounter());
        }
    }
}
