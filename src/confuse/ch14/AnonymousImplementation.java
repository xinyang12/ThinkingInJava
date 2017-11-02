package confuse.ch14;

import static util.Print.print;

class AnonymousA {
    public static A makeA() {
        return new A() {
            public void f() {
                print("public C.g()");
            }
            public void g() {
                print("public C.g()");
            }
            void u() {
                print("pakcage C.u()");
            }
            protected void v() {
                System.out.println("protected C.v()");
            }
            private void w() {
                print("private C.w()");
            }
        };
    }
}

public class AnonymousImplementation {
    public static void main(String[] args) throws Exception {
        A a = AnonymousA.makeA();
        a.f();
        HiddenImplementation.callHiddenMethod(a, "g");
        HiddenImplementation.callHiddenMethod(a, "u");
        HiddenImplementation.callHiddenMethod(a, "v");
        HiddenImplementation.callHiddenMethod(a, "w");
    }
}
