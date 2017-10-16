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
        for (String str : s) {
//            if (answer.contains())
        }
    }
}
