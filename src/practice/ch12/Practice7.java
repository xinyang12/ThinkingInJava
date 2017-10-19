package practice.ch12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Practice7 {
    private static Logger logger = Logger.getLogger("Practice7");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        try {
            int[] array = new int[10];
            array[10] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//            System.out.println("array index out of bound exception");
            logException(e);
        }
    }
}
