package practice.ch12;

class Prac8Exception extends Exception {

}

public class Practice8 {
    public static void testException() throws Prac8Exception {

    }

    public static void main(String[] args) {
        try {
            testException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
