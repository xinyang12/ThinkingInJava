package confuse.ch11;

import pets.Pet;
import pets.Pets;

import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        // listIterator
        ListIterator<Pet> it = pets.listIterator();
//        System.out.println(it.nextIndex());
//        System.out.println(it.previousIndex());
        while (it.hasNext()) {
            System.out.print(it.next() + ", " + it.nextIndex() + ", " +
                    it.previousIndex() + "; ");
            System.out.println();
        }
        while (it.hasPrevious()) {
            System.out.print(it.previous().id() + " ");
        }
        System.out.println();
        System.out.println(pets);
        it = pets.listIterator(3);
//        System.out.println(it.next());
        while (it.hasNext()) {
//            it.next();
            System.out.println("next is: " + it.next());
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
