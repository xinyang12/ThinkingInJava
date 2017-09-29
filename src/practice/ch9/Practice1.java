package practice.ch9;

abstract class Rodent {
    Rodent() {
        System.out.println("Rodent");
    }
    abstract void color();

    abstract void dispose();
}

class Mouse extends Rodent {
    Mouse() {
        System.out.println("Mouse");
    }
    public void color() {
        System.out.println("The color is mouse");
    }
    public void dispose() {
        System.out.println("The dispose is transferring");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse();
        mouse1.dispose();
    }
}
