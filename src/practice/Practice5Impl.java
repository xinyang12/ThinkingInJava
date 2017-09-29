package practice;

import practice.ch9.Practice5;

public class Practice5Impl implements Practice5 {
    public void print1() {
        System.out.println("print1()");
    }
    public void print2() {
        System.out.println("print2()");
    }
    public void print3() {
        System.out.println("print3()");
    }

    public static void main(String[] args) {
        Practice5 test = new Practice5Impl();
        test.print1();
        test.print2();
        test.print3();
    }
}
