package practice.ch11;

import java.util.*;

class Generator {
    int key = 0;
    public String next() {
        switch (key) {
            default :
            case 0:
                key++;
                return "Snow White";
            case 1:
                key++;
                return "Bashful";
            case 2:
                key++;
                return "Doc";
            case 3:
                key++;
                return "Dopey";
            case 4:
                key++;
                return "Grumpy";
            case 5:
                key++;
                return "Happy";
            case 6:
                key++;
                return "Sleepy";
            case 7:
                key = 0;
                return "Sneezy";
        }
    }
    public void fill(String[] a) {
        for (int i = 0; i < a.length; ++i) {
            a[i] = next();
        }
    }
    public Collection fill(Collection<String> c, int n) {
        for (int i = 0; i < n; ++i) {
            c.add(next());
        }
        return c;
    }
}

public class Practice4 {
    public static void main(String[] args) {
        Generator gen = new Generator();
        String[] a = new String[10];
        gen.fill(a);
        for (String s : a) {
            System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println(gen.fill(new ArrayList<>(), 100));
        System.out.println(gen.fill(new LinkedList<>(), 10));
        System.out.println(gen.fill(new HashSet<>(), 10));
        System.out.println(gen.fill(new LinkedHashSet<>(), 10));
        System.out.println(gen.fill(new TreeSet<>(), 10));
    }
}
