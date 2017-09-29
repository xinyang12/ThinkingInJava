package practice.ch9;

interface Rodent1 {
    void color();
}

class Mouse1 implements Rodent1 {
    public void color() {
        System.out.println("mouse");
    }
}

class Gerbil1 implements Rodent1 {
    public void color() {
        System.out.println("gerbil");
    }
}

class Hamster implements Rodent1 {
    public void color() {
        System.out.println("hamster");
    }
}

public class Practice7 {
    public static void main(String[] args) {
        Rodent1[] rodent1s = {
                new Mouse1(),
                new Gerbil1(),
                new Hamster()
        };
        for (int i = 0; i < rodent1s.length; ++i) {
            rodent1s[i].color();
        }
    }
}
