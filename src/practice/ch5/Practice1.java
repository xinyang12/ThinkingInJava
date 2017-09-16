package practice.ch5;

public class Practice1 {

    // 如果不初始化，编译错误
    public static void main(String[] args) {
        String test = "";
        if (test == null) {
            System.out.println("null");
        } else {
            System.out.println("not null");
        }
    }

}
