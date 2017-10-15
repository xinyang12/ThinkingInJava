package practice.ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Prac7 {

}

public class Practice7 {
    public static void main(String[] args) {
        Prac7[] p = new Prac7[10];
//        for (int i = 0; i < p.length; ++i) {
//            p[i] = new Prac7();
//        }
        /**
         * 用Arrays.asList创建的数组不能在list上进行增删操作
         */
        List<Prac7> pr = Arrays.asList(p);
        pr.set(1, new Prac7());
        List<Prac7> subList = pr.subList(2, 4);
//        pr.add(new Prac7());
        List<Prac7> pra = new ArrayList<>(pr);
        pra.removeAll(subList);
    }
}
