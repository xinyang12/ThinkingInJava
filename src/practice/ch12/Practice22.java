package practice.ch12;

class Prac22Exception extends Exception {}

class FailingConstructor {
    public FailingConstructor() throws Prac22Exception {}
}

public class Practice22 {
    public static void main(String[] args) {
        try {
            FailingConstructor f1 = new FailingConstructor();
            try {
                FailingConstructor f2 = new FailingConstructor();
            } catch (Prac22Exception e) {
                e.printStackTrace();
            }
        } catch (Prac22Exception e) {
            e.printStackTrace();
        }
    }
}
