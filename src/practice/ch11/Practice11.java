package practice.ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Practice11 {
    public static void iterator(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        LinkedList linkedList = new LinkedList(arrayList);
        HashSet hashSet = new HashSet(arrayList);
        TreeSet treeSet = new TreeSet(arrayList);

        iterator(arrayList.iterator());
        iterator(linkedList.iterator());
        iterator(hashSet.iterator());
        iterator(treeSet.iterator());
    }
}
