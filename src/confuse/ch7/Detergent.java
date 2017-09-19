package confuse.ch7;

public class Detergent {
    private Cleanser cleanser = new Cleanser();
    private String s = "Detergent";
    public void scrub() {
        cleanser.scrub();
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
        System.out.println("Testing base class: ");
        Cleanser.main(args);
    }
}
