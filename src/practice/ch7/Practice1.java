package practice.ch7;

class Apple {
    private String name;
    public Apple(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}

public class Practice1 {
    private static Apple apple;
    private Practice1() {}
    private static Apple getInstance() {
        if (apple == null) {
            apple = new Apple("testApple");
        }
        return apple;
    }

    public static void main(String[] args) {
        Apple apple = Practice1.getInstance();
        System.out.println(apple.getName());
    }

}
