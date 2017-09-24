package confuse.ch8;

public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();
    private Shape shape;
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; ++i) {
            s[i] = gen.next();
        }

        for (Shape shp : s) {
            shp.print();
        }
    }
}
