package practice.ch9;

interface Cycle {
    void name();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public void name() {
        System.out.println("Unicycle");
    }
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {
    public void name() {
        System.out.println("Bicycle");
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    public void name() {
        System.out.println("Tricycle");
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class Practice18 {

    public static void OutputName(CycleFactory cycleFactory) {
        cycleFactory.getCycle().name();
    }

    public static void main(String[] args) {
        OutputName(new UnicycleFactory());
        OutputName(new BicycleFactory());
        OutputName(new TricycleFactory());
    }

}
