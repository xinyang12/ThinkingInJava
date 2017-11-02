package confuse.ch15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);
    public void add(T item) {
        storage.add(item);
    }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }
    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s : ("The quick brown fox jumped over " + "the lazy brown dog").split(" ")) {
            rs.add(s);
        }
        for (int i = 0; i < 11; ++i) {
            System.out.println(rs.select() + " ");
        }

        RandomList<Integer> rs2 = new RandomList<>();
        for (Integer i : Arrays.asList(1, 2, 3, 4)) {
            rs2.add(i);
        }
        for (int i = 0; i < 11; ++i) {
            System.out.println(rs2.select() + " ");
        }

        RandomList<Double> rs3 = new RandomList<>();
        for (Double d : Arrays.asList(1.32, 4.3, 5.65, 4.56)) {
            rs3.add(d);
        }
        for (int i = 0; i < 11; ++i) {
            System.out.println(rs3.select() + " ");
        }
    }
}
