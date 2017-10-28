package practice.ch14;

/**
 * 可见char数组是一个对象
 */
public class Practice10 {
    public static void main(String[] args) {
        char[] chars = new char[10];
        System.out.println(chars.getClass().getName());
        System.out.println(chars.getClass().getSuperclass().getName());
        System.out.println(chars instanceof Object);
        System.out.println(int.class);
        System.out.println(Integer.TYPE);
        System.out.println(Boolean.TYPE);
    }
}
