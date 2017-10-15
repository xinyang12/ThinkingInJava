package practice.ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practice12 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>(list1.size());
        ListIterator<Integer> listIterator2 = list2.listIterator();
        ListIterator<Integer> iterator = list1.listIterator(list1.size());
        while (iterator.hasPrevious()) {
            list2.add(iterator.previous());
        }
        System.out.println(list1);
        System.out.println(list2);
    }
}
