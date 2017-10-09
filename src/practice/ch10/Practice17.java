package practice.ch10;

interface Thing {
    void name();
}

class ThrowCoin implements Thing {
    public void name() {
        System.out.println("coin");
    }
    public ThingFactory factory = new ThingFactory() {
        public Thing getThing() {
            return new ThrowCoin();
        }
    };
}

class ThrowDice implements Thing {
    public void name() {
        System.out.println("dice");
    }
    public ThingFactory factory = new ThingFactory() {
        public Thing getThing() {
            return new ThrowDice();
        }
    };
}

interface ThingFactory {
//    void action(Thing thing);
    Thing getThing();
}

//class ThingFactoryImpl implements ThingFactory {
//    public void action(Thing thing) {
//        thing.name();
//    }
//}

public class Practice17 {
    public static void playGame(ThingFactory factory) {
        Thing t = factory.getThing();
        t.name();
    }
    public static void main(String[] args) {
        ThrowCoin tc = new ThrowCoin();
        ThrowDice td = new ThrowDice();
        playGame(tc.factory);
        playGame(td.factory);
    }
}
