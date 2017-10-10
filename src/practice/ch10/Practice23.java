package practice.ch10;

interface U {
    void method1();
    void method2();
    void method3();
}

class A {
    U getU() {
        return new U() {
            public void method1() {}
            public void method2() {}
            public void method3() {}
        };
    }
}

class B {
    int length = 10;
    U[] array = new U[length];
    public void save(U u, int index) {
        array[index] = u;
    }
    public void setNull(int index) {
        array[index] = null;
    }
    public void traversal() {
        for (int i = 0; i < length; ++i) {
            if (array[i] != null) {
                System.out.println(array[i].toString());
                array[i].method1();
                array[i].method2();
                array[i].method3();
            } else {
                System.out.println("null");
            }
        }
//        for (U u : array) {
//            if (u != null) {
//                System.out.println(u.toString());
//            } else {
//                System.out.println("null");
//            }
//        }
    }
}

public class Practice23 {
    public static void main(String[] args) {
        A[] array = new A[10];
        for (int i = 0; i < 10; ++i) {
            array[i] = new A();
        }
        B b = new B();
        for (int i = 0; i < 10; ++i) {
            b.save(array[i].getU(), i);
        }
//        b.traversal();
        b.setNull(2);
        b.setNull(4);
        b.traversal();
    }
}
