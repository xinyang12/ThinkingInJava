package confuse.ch11;

import pets.Pet;
import pets.Pets;

import java.util.*;

public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + " : " + p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        for (Pet p : pets) {
            System.out.print(p.id() + " : " + p + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 随机Pet的List
        List<Pet> petList = Pets.arrayList(8);
        // 构造Set
        Set<Pet> petSet = new HashSet<>(petList);
        Map<String, Pet> petMap = new LinkedHashMap<>();
        String[] names = ("Ralph, Eric, Robin, Lacey, Britney, Sam, Spot, Fluffy").split(", ");
        // 给宠物起名字
        for (int i = 0; i < names.length; ++i) {
            petMap.put(names[i], petList.get(i));
        }
        // 打印
        display(petList);
        display(petSet);
        display(petList.iterator());
        display(petSet.iterator());
        System.out.println(petMap);
        System.out.println(petMap.keySet());
        display(petMap.values());
        display(petMap.values().iterator());
    }
}
