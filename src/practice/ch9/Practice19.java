package practice.ch9;

interface Thing {
    void name();
}

class ThrowCoin implements Thing {
    public void name() {
        System.out.println("coin");
    }
}

class ThrowDice implements Thing {
    public void name() {
        System.out.println("dice");
    }
}

interface ThingFactory {
    void action(Thing thing);
}

class ThingFactoryImpl implements ThingFactory {
    public void action(Thing thing) {
        thing.name();
    }
}

public class Practice19 {
    public static void main(String[] args) {
        ThingFactoryImpl test = new ThingFactoryImpl();
        ThrowCoin a1 = new ThrowCoin();
        ThrowDice a2 = new ThrowDice();
        test.action(a1);
        test.action(a2);
    }
}
