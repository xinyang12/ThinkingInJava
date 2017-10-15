package confuse.ch11;

import pets.Pet;
import pets.Pets;

import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets  = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
        for (Pet p : pets) {
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
        it = pets.iterator();
        // 隔一个删除一个
        for (int i = 0; i < 6; ++i) {
            it.next();
            System.out.println("next is " + it.next());
            it.remove();
        }
        System.out.println(pets);
    }
}
