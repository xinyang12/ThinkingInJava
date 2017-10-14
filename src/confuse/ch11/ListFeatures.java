package confuse.ch11;

import pets.*;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.print("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);
        System.out.print("2: " + pets);
        System.out.print("3: " + pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        System.out.print("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        System.out.print("5: " + pets.indexOf(cymric));
        System.out.print("6: " + pets.remove(cymric));
        System.out.print("7: " + pets.remove(p));
        System.out.print("8: " + pets);
        pets.add(3, new Mouse());
        System.out.print("9: " + pets);
        List<Pet> sub = pets.subList(1, 4);
        System.out.print("subList: " + sub);
        System.out.print("10: " + pets.containsAll(sub));
        Collections.sort(sub);
        System.out.print("sorted subList: " + sub);

    }
}
