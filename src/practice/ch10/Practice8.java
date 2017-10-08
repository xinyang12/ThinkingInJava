package practice.ch10;

public class Practice8 {
    class Inner {
        private int i = 1;
    }
    int getI() {
        return new Inner().i;
    }
    public static void main(String[] args) {
        Practice8 pr = new Practice8();
        Inner inner = pr.new Inner();
        System.out.println(inner.i);
        System.out.println(pr.getI());
    }
}
