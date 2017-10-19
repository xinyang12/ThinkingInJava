package practice.ch12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class Prac6Exception1 extends Exception {
    private static Logger logger = Logger.getLogger("Prac6Exception1");
    public Prac6Exception1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class Prac6Exception2 extends Exception {
    private static Logger logger = Logger.getLogger("Prac6Exception2");
    public Prac6Exception2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Practice6 {
    public static void main(String[] args) {
        try {
            throw new Prac6Exception1();
        } catch (Prac6Exception1 e) {
            System.err.println("Caught " + e);
        }

        try {
            throw new Prac6Exception2();
        } catch (Prac6Exception2 e) {
            System.err.println("Caught " + e);
        }
    }
}
