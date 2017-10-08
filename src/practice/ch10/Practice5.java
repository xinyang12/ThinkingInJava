package practice.ch10;

class OuterInP5 {

    class InnerInp5 {

    }
}

public class Practice5 {
    public static void main(String[] args) {
        OuterInP5 p = new OuterInP5();
        OuterInP5.InnerInp5 i = p.new InnerInp5();
    }
}
