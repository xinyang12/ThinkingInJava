package practice.ch10;

public class Practice7 {
    private String name = "init";
    private void printName() {
        System.out.println("name is " + name);
    }
    class Inner {
        void changeName(String name) {
            Practice7.this.name = name;
            printName();
        }
    }
    public void doSomething() {
//        Practice7 pr = new Practice7();
//        Practice7.Inner i = pr.new Inner();
//        i.changeName("change");
        Inner inner = new Inner();
        inner.changeName("change");
    }
    public static void main(String[] args) {
        Practice7 pr = new Practice7();
        pr.doSomething();
        System.out.println(pr.name);
    }
}
