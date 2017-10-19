package practice.ch12;

class Prac3Exception extends Exception {
    private String args;
    Prac3Exception(String args) {
        super(args);
        this.args = args;
    }
    public void print() {
        System.out.println(args);
    }
}

public class Practice4 {
    public static void main(String[] args) {
        try {
            throw new Prac3Exception("sdf");
        } catch (Prac3Exception e) {
            e.print();
        }
    }
}
