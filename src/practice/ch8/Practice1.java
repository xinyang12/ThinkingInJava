package practice.ch8;

class Cycle {
    public void play() {
        System.out.println("play Cycle");
    }
    public int wheels() {
        return 1;
    }
}

class Unicycle extends Cycle {
    public void play() {
        System.out.println("play Unicycle");
    }
    public int wheels() {
        return 123;
    }
    public void balance() {
        System.out.println("balance in unicycle");
    }
}

class Bicycle extends Cycle {
    public void play() {
        System.out.println("play Bicycle");
    }
    public int wheels() {
        return 2;
    }
    public void balance() {
        System.out.println("balance in bicycle");
    }
}

class Tricycle extends Cycle {
    public void play() {
        System.out.println("play Tricycle");
    }
    public int wheels() {
        return 3;
    }
}

public class Practice1 {
    public static void ride(Cycle c) {
        System.out.println(c.wheels());
    }
    public static void main(String[] args) {
//        Cycle cycle = new Cycle();
//        Unicycle unicycle = new Unicycle();
//        Bicycle bicycle = new Bicycle();
//        Tricycle tricycle = new Tricycle();
//
//        ride(cycle);
//        ride(unicycle);
//        ride(bicycle);
//        ride(tricycle);
        Cycle[] cycle = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
        ((Unicycle)cycle[0]).balance();
        ((Bicycle)cycle[1]).balance();
    }
}
