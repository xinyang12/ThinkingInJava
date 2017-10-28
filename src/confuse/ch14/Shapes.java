package confuse.ch14;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape {
    boolean flag = false;
    public String toString() {
        return "Circle " + flag;
    }
}

class Square extends Shape {
    boolean flag = false;
    public String toString() {
        return "Square " + flag;
    }
}

class Triangle extends Shape {
    boolean flag = false;
    public String toString() {
        return "Triangle " + flag;
    }
}

class Rhomboid extends Shape {
    boolean flag = false;
    public String toString() {
        return "Rhomboid " + flag;
    }
}

public class Shapes {

    /**
     * 使用instanceOf，不知道使用注释的这个方法行不行，反正运行是没啥问题
     * @param shape
     */
    public static void rotate(Shape shape) {
//        if (shape.toString().equals("Circle")) {
//            System.out.println("no");
//        } else {
//            System.out.println("yes");
//        }
        if (shape instanceof Circle) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
    public static void setFlag(Shape shape) {
        if (shape instanceof Triangle) {
            ((Triangle) shape).flag = true;
        }
    }
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for (Shape shape : shapeList) {
//            rotate(shape);
//            shape.draw();
            setFlag(shape);
            System.out.println(shape);
        }
    }
}
