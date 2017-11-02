package practice.ch15;

import confuse.ch15.FiveTuple;

class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
    public final F sixth;
    public SixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        sixth = f;
    }
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ", " + fourth +
                ", " + fifth + ", " + sixth + ")";
    }
}

public class Practice3 {
    public static void main(String[] args) {
        SixTuple<Integer, String, Integer, Integer, Integer, Integer> sixTuple =
                new SixTuple<>(1, "sdf", 2, 3, 4, 5);
        System.out.println(sixTuple);
    }
}
