package practice.ch11;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Practice14 {
    public static void addMiddle(List<Integer> list,
                                 Integer[] array) {
        ListIterator<Integer> iterator;
        for (Integer i : array) {
            iterator = list.listIterator(list.size() / 2);
            iterator.add(i);
            System.out.println(list);
        }
//        iterator =
    }
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Integer[] array = {1, 2, 3};
        addMiddle(list, array);
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        System.out.println(list.size());
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
