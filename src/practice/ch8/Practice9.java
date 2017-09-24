package practice.ch8;

class Rodent {
    Rodent() {
        System.out.println("Rodent");
    }
    void color() {}

    void dispose() {
        System.out.println("dispose Rodent");
    }
}

class Mouse extends Rodent {
    Mouse() {
        System.out.println("Mouse");
    }
    @Override
    void color() {
        System.out.println("Rodent");
    }

    @Override
    void dispose() {
        System.out.println("dispose Mouse");
        super.dispose();
    }
}

class Gerbil extends Mouse {
    Gerbil() {
        System.out.println("Gerbil");
    }
    @Override
    void color() {
        System.out.println("Gerbil");
    }
    @Override
    void dispose() {
        System.out.println("dispose Gerbil");
        super.dispose();
    }
}

class Hamster extends Gerbil {
    Hamster() {
        System.out.println("Hamster");
    }
    @Override
    void color() {
        System.out.println("Hamster");
    }
    @Override
    void dispose() {
        System.out.println("dispose Hamster");
        super.dispose();
    }
}

public class Practice9 {
    public static void main(String[] args) {
//        Rodent[] array = new Rodent[4];
//        array[0] = new Gerbil();
//        array[1] = new Mouse();
//        array[2] = new Hamster();
//        array[3] = new Rodent();
//        Rodent rodent;
//        for (int i = 0; i < 4; ++i) {
//            rodent = array[i];
//            rodent.color();
//        }
        // 练习12
        Hamster hamster = new Hamster();
        hamster.dispose();
    }
}
