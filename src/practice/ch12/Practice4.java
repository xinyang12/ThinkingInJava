package practice.ch12;

/**
 * 加入练习28
 * RuntimeException可以不被catch
 */
class Prac4Exception extends RuntimeException {
    private String args;
    Prac4Exception(String args) {
        super(args);
        this.args = args;
    }
    public void print() {
        System.out.println(args);
    }
}

public class Practice4 {
    public static void main(String[] args) {
//        try {
            throw new Prac4Exception("sdf");
//        } catch (Prac4Exception e) {
//            e.print();
//        }
    }
}
