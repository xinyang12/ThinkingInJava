package practice.ch12;

class Prac21Exception extends Exception {}

class Prac21Base {
    public Prac21Base() throws Prac21Exception {}
}

/**
 * super构造器语句必须位于第一行。。。
 */
class Prac21Ext extends Prac21Base {
    public Prac21Ext() throws Prac21Exception {
        super();
    }
}

public class Practice21 {
    public static void main(String[] args) {
        try {
            Prac21Ext p = new Prac21Ext();
        } catch (Prac21Exception e) {
            e.printStackTrace();
        }
    }
}
