package confuse.ch11;

import pets.Hamster;
import pets.Pet;
import pets.Pets;
import pets.Rat;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets =
                new LinkedList<>(Pets.arrayList(5));
        System.out.println(pets);
        System.out.println("pets.element(): " + pets.element());
        System.out.println("pets.peek(): " + pets.peek());
        System.out.println("pets.remove() : " + pets.remove());
        System.out.println("pets is " + pets);
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println(pets);
        pets.addFirst(new Rat());
        System.out.println("After addFirst(): " + pets);
        pets.offer(Pets.randomPet());
        System.out.println("After offer(): " + pets);
        pets.add(Pets.randomPet());
        System.out.println("After add(): " + pets);
        pets.addLast(new Hamster());
        System.out.println("After addLast(): " + pets);
        System.out.println("removeLast(): " + pets.removeLast());
        System.out.println("pets now is : " + pets);
    }
}