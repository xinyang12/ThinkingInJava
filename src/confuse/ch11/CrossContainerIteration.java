package confuse.ch11;

import pets.Pet;
import pets.Pets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class CrossContainerIteration {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // arraylist
        ArrayList<Pet> pets = Pets.arrayList(8);
        // linkedlist
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        // hashset
        HashSet<Pet> petsHS = new HashSet<>(pets);
        // treeset
        TreeSet<Pet> petsTS = new TreeSet<>(pets);

        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
