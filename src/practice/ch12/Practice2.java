package practice.ch12;

class Prac2Class {
    void haha() {
        System.out.println("haha");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        try {
            Prac2Class p = null;
            p.haha();
        } catch (NullPointerException e) {
//            System.out.println("asdf");
            e.printStackTrace();
        }
    }
}
