package practice.ch10;

class Outer {
    private String name;
    public Outer(String name) {
        this.name = name;
    }
    Inner getInner() {
        return new Inner();
    }
    class Inner {
        public String toString() {
            return name;
        }
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Outer p = new Outer("test");
        Outer.Inner t = p.getInner();
        System.out.println(t.toString());
    }
}
