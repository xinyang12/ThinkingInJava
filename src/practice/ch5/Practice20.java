package practice.ch5;

public class Practice20 {
    public static void main(String[] args) {
        String[] test = {"123", "234", "345"};
        TestMainArgs.main(test);
    }
}

class TestMainArgs {
    public static void main(String ... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}
