package confuse.ch7;

class Gizmo {
    public void spin() {}
}

public class FinalArguments {
    // java 允许在参数列表中以声明的方式将参数指明为final
    // 这意味着你无法在方法中更改参数引用所指向的对象
    void with(final Gizmo g) {
        //g = new Gizmo();
//        g.spin();
    }
    void without(Gizmo g) {
        g=  new Gizmo();
        g.spin();
    }

    int g(final int i) {
        return i + 1;
    }
    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
