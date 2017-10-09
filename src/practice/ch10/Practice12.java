package practice.ch10;

interface Prac12Interface {
    void changeName(String name);
}

/**
 * 使用匿名内部类替换之前practice7的做法
 */
public class Practice12 {
    private String name = "init";
    private void printName() {
        System.out.println("name is " + name);
    }
    public Prac12Interface doSomething() {
        return new Prac12Interface() {
            @Override
            public void changeName(String name) {
                Practice12.this.name = name;
                printName();
            }
        };
    }
    public static void main(String[] args) {
        Practice12 pr = new Practice12();
        pr.printName();
        pr.doSomething().changeName("change2");
        pr.printName();
        System.out.println(pr.name);
    }
}
