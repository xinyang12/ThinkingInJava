package practice.ch12;

public class Practice1 {
    public static void main(String[] args) {
        try {
            throw new Exception("haha");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally statement");
        }
//        System.out.println(":sdf");
    }
}
