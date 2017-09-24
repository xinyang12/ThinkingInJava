package practice.ch8;

class P4class1 {
    private int refcount = 0;
    private static int count = 0;
    private final int id = count++;
    P4class1() {
        System.out.println("Creating " + this);
    }
    public String toString() {
        return "P4class1 " + id;
    }
    void addRef() {
        ++refcount;
    }
    void dispose() {
        if (--refcount == 0) {
            System.out.println("disposing " + this);
        }
    }
}

class P4class2 {
    private P4class1 p4class1 = new P4class1();
    private static int counter = 0;
    private final int id = counter++;
    P4class2(P4class1 p4class1) {
        System.out.println("Creating " + this);
        this.p4class1 = p4class1;
        this.p4class1.addRef();
    }
    public String toString() {
        return "P4class2 " + id;
    }
    void dispose() {
        System.out.println("disposing " + this);
        this.p4class1.dispose();
    }
}

public class Practice4 {
    public static void main(String[] args) {
        P4class1 p4class1 = new P4class1();
        P4class2 p4class2 = new P4class2(p4class1);
        P4class2 p4class21 = new P4class2(p4class1);
        p4class2.dispose();
    }
}
