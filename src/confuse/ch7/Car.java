package confuse.ch7;

class Engine {
    Engine() {
        System.out.println("engine cons");
    }
    public void start() {}
    public void rev() {}
    public void stop() {}
    public void service() {}
}

class Wheel {
    Wheel() {
        System.out.println("wheel cons");
    }
    public void inflate(int psi) {}
}

class Window {
    Window() {
        System.out.println("window cons");
    }
    public void rollup() {}
    public void rolldown() {}
}

class Door {
    Door() {
        System.out.println("door cons");
    }
    public Window window = new Window();
    public void open() {}
    public void close() {}
}

public class Car {

    public Car() {
        for (int i = 0; i < 4; ++i) {
            wheel[i] = new Wheel();
        }
    }
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(), right = new Door();

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.engine.service();
    }

}
