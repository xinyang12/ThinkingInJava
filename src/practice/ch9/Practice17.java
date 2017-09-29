package practice.ch9;

import confuse.ch9.Months;

public class Practice17 implements Months {
    public static void main(String[] args) {
        System.out.println(Months.JANUARY);
        // static 不能被赋值
//        JANUARY = 2;
    }
}
