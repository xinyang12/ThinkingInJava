package confuse.ch7;

class Poppet {
    private int i;
    Poppet(int ii) {
        i = ii;
    }
}

public class BlankFinal {
    private final int i = 0;
    // 空白final
    // 必须在域的定义处或者每个构造器中用表达式对final进行赋值，
    // 这正是final域在使用前总被初始化的原因所在
    private final int j;
    private final Poppet p;
    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }
    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }
    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
