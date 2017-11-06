package confuse.ch15;

import confuse.ch15.coffee.Coffee;
import confuse.ch15.coffee.CoffeeGenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            coll.add(gen.next());
        }
        return coll;
    }
    public static <T> List<T> fill(List<T> coll,Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            coll.add(gen.next());
        }
        return coll;
    }
    public static <T> LinkedList<T> fill(LinkedList<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            coll.add(gen.next());
        }
        return coll;
    }
    public static <T> ArrayList<T> fill(ArrayList<T> coll,Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            coll.add(gen.next());
        }
        return coll;
    }
    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffee) {
            System.out.println(c);
        }
        Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
        for (int i : fnumbers) {
            System.out.println(i + ", ");
        }
    }
}
