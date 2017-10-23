package confuse.ch13;

/**
 * format与printf是等价的，实际上，printf里面就是调用的format
 */
public class SimpleFormat {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;
        System.out.println("Row 1: [" + x + " " + y + "]");
        System.out.format("Row 1: [%d %f]\n", x, y);
        System.out.printf("Row 1: [%d %f]\n", x, y);
    }
}
