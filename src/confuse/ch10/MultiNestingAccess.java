package confuse.ch10;

/**
 * 内部类能够透明地访问所有它所嵌入的外围类的所有成员，无论是否是private
 */
class MNA {
    private void f() {
    }
    class A {
        private void g() {}
        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
