package confuse.ch2;

public class StringOperators {

    // 如果表达式以一个字符串起头，那么后续所有操作数都必须是字符串类型

    // 一个空的String后面跟随 “+” 和一个基本类型变量
    // 以此作为不调用更加麻烦的显式方法
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);
        s += "(summed) = ";
        System.out.println(s + (x + y + z));
        System.out.println("" + x);
    }

}
