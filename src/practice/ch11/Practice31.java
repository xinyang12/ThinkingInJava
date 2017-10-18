package practice.ch11;

import confuse.ch8.Circle;
import confuse.ch8.Shape;
import confuse.ch8.Square;
import confuse.ch8.Triangle;

import java.util.Iterator;
import java.util.Random;

/**
 * 要实现Iterable，就要实现iterator()
 */
class RandomShapeGenerator implements Iterable<Shape> {
    int n;
    RandomShapeGenerator(int n) {
        this.n = n;
        shapes = new Shape[n];
        for (int i = 0; i < n; ++i) {
            shapes[i] = next();
        }
    }
    private Random rand = new Random();
    private Shape[] shapes;
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;
            public boolean hasNext() {
                return index < shapes.length;
            }
            public Shape next() {
                return shapes[index++];
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}


public class Practice31 {
    public static void main(String[] args) {
        RandomShapeGenerator rsg = new RandomShapeGenerator(3);
        for (Shape s : rsg) {
            System.out.println(s);
        }
    }
}
