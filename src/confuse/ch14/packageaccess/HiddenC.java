package confuse.ch14.packageaccess;

import confuse.ch14.A;

import static util.Print.print;

class C implements A {
    public void f() {
        print("public C.f()");
    }
    public void g() {
        print("public C.g()");
    }
    void u() {
        print("package C.u()");
    }
    protected void v() {
        print("protected C.b()");
    }
    private void w() {
        print("private C.w()");
    }
}

public class HiddenC {
    public static A makeA() {
        return new C();
    }
}
