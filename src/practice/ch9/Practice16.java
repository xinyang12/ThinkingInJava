package practice.ch9;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * 完全抄书上的。。。。
 */

class RandomChars {
    private static Random rand = new Random(47);
    public char next() {
        return (char)rand.nextInt(128);
    }
    public static void main(String[] args) {
        RandomChars rd = new RandomChars();
        for (int i = 0; i < 7; ++i) {
            System.out.println(rd.next() + " ");
        }
    }
}

public class Practice16 extends RandomChars implements Readable {
    private int count;
    public Practice16(int count) {
        this.count = count;
    }
    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new Practice16(7));
        while (s.hasNext()) {
            System.out.println(s.next() + " ");
        }
    }
}
