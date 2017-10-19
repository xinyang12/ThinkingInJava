package practice.ch12;

class Prac9Exception1 extends Exception {

}

class Prac9Exception2 extends Exception {

}

class Prac9Exception3 extends Exception {

}

public class Practice9 {
    public static void main(String[] args) {
        try {
            testException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void testException() throws Prac9Exception1, Prac9Exception2, Prac9Exception3 {

    }
}
