package practice.ch12;

/**
 * 加入练习27
 */
public class Practice3 {
    public static void main(String[] args) {
        try {
            int[] array = new int[10];
            array[10] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//            System.out.println("array index out of bound exception");
            throw new RuntimeException(e);
        }
    }
}
