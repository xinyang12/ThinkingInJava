package confuse.ch8;

class Useful {
    public void f() {}
    public void g() {}
}

class MoreUseful extends Useful {
    public void f() {}
    public void g() {}
    public void u() {}
    public void v() {}
    public void w() {}
}

public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].g();
        ((MoreUseful)x[1]).u();
        // 下面出现异常 ClassCastException
        // ((MoreUseful)x[0]).u();
    }
}
