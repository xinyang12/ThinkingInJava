package practice.ch5;

public class Practice10 {

    protected void finalize() {
        System.out.println("cleaning");
    }

    public static void main(String[] args) {
        Practice10 practice10 = new Practice10();
//        practice10.finalize();
        new Practice10();
        System.gc();
    }

}
