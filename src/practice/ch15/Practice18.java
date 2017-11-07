package practice.ch15;

import confuse.ch15.Generator;
import confuse.ch15.Generators;

import java.util.*;

class LittleFish {
    private static long counter = 1;
    private final long id = counter++;
    private LittleFish() {}
    public String toString() {
        return "LittleFish " + id;
    }
    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}

class BigFish {
    private static long counter = 1;
    private final long id = counter++;
    private BigFish() {}
    public String toString() {
        return "BigFish " + id;
    }
    public static Generator<BigFish> generator = new Generator<BigFish>() {
        public BigFish next() {
            return new BigFish();
        }
    };
}

public class Practice18 {
    public static void eat(BigFish bigFish, LittleFish littleFish) {
        System.out.println(bigFish + " eats " + littleFish);
    }
    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<LittleFish> line = new LinkedList<>();
        Generators.fill(line, LittleFish.generator(), 15);
        List<BigFish> bigFish = new ArrayList<>();
        Generators.fill(bigFish, BigFish.generator, 4);
        for (LittleFish l : line) {
            eat(bigFish.get(rand.nextInt(bigFish.size())), l);
        }
    }
}
