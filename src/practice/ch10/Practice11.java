package practice.ch10;

class Prac11Outer {
    private class Prac11Class implements Prac11Interface {
        public void method() {
            System.out.println("implement");
        }
    }
    public Prac11Interface getInstance() {
        return new Prac11Class();
    }
}

public class Practice11 {

    public static void main(String[] args) {
        Prac11Outer pr = new Prac11Outer();
        pr.getInstance().method();
//        ((Prac11Class) pr.getInstance()).method();
    }
}
