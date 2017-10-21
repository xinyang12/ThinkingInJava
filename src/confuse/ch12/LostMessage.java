package confuse.ch12;

/**
 * 添加 ch12练习18
 */
class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

class ThirdException extends Exception {
    public String toString() {
        return "Third exception";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void third() throws ThirdException {
        throw new ThirdException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                try {
                    lm.f();
                } catch (VeryImportantException e) {
                    System.out.println(e);
                } finally {
                    lm.dispose();
                }
            } catch (HoHumException e) {
                System.out.println(e);
            } finally {
                lm.third();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
