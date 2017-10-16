package confuse.ch11;

import util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(
                new TextFile("src/confuse/ch11/SetOperations.java", "\\W+")
        );
        System.out.println(words);
    }
}
