package confuse.ch7;

class WithFinals {
    // 类中所有的private方法都隐式地制定为是final的
    // 由于无法取用private方法，所以也就无法覆盖它。
    // 可以对private方法添加final修饰词
    // 但这并不能给该方法添加任何额外的意义
    private final void f() {
        System.out.println("WithFinals.f()");
    }
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
//        op.f();
//        op.g();
        WithFinals wf = op2;
//        wf.f();
    }
}
