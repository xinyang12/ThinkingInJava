package confuse.ch7;

/**
 * 加入ch12 练习16
 */
class Shape {
    Shape(int i) {
        System.out.println("Shape constructor");
    }
    void dispose() {
        System.out.println("Shape dispose");
    }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }
    void dispose() {
        super.dispose();
        System.out.println("Erasing Circle");
    }
}

public class CADSystem {
    public static void main(String[] args) {
        Circle circle = null;
        try {
            circle = new Circle(1);
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            circle.dispose();
        }
    }

}
