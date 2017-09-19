package confuse.ch7;

class Instrument {
    public void play() {
        System.out.println("This is the play method");
    }
    static void tune(Instrument i) {
        System.out.println("This is the tune in the parent");
        i.play();
    }
}

// 向上转型，upcasting
public class Wind extends Instrument {
    static void tune(Instrument i) {
        System.out.println("This is the tune in the child");
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        Wind.tune(flute);
    }
}
