package practice.ch8;

class P10base {
    public void method1() {
        method2();
    }

    public void method2() {
        System.out.println("method2 in base");
    }
}

class P10extend extends P10base {
    @Override
    public void method2() {
        System.out.println("method2 in extend");
    }
}

public class Practice10 {
    public static void transfer(P10base p10base) {
        p10base.method1();
    }
    public static void main(String[] args) {
        transfer(new P10extend());
    }
}
