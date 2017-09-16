package practice.ch5;

public class Practice14 {

    static String test1 = "test1";
    static String test2;
    static {
        test2 = "test2";
    }

    static void print() {
        System.out.println("test1 is " + test1 + " and test2 is " + test2);
    }

    public static void main(String[] args) {
        Practice14 practice14 = new Practice14();
        practice14.print();
    }

}
