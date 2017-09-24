package confuse.ch8;

public class PrivateOverride {
    // 只有非private方法才可以被覆盖
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}


class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}