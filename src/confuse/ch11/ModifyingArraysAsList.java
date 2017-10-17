package confuse.ch11;

import java.util.*;

public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random rand = new Random(47);
        // 第一种情况，Arrays.asList()的输出被传递给了ArrayList()的构造器
        // 这将创建一个引用ia的元素的ArrayList，因此打乱这些引用不会修改该数组

        Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(ia));
        System.out.println("Before shuffing: " + list1);
        Collections.shuffle(list1, rand);
        System.out.println("After shuffling: " + list1);
        System.out.println("array: " + Arrays.toString(ia));


        // 但是，如果直接使用ArrayList.asList(ia)的结果，这种打乱就会修改ia的顺序
        List<Integer> list2 = Arrays.asList(ia);
        System.out.println("Before shuffling: " + list2);
        Collections.shuffle(list2, rand);
        System.out.println("After shuffling: " + list2);
        System.out.println("array: " + Arrays.toString(ia));
    }
}
