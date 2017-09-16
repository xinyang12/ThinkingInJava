package confuse.ch2;

public class Equivalence {

    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        // == 和 != 比较的是对象的引用，所以先输出false，后输出true
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
    }

}
