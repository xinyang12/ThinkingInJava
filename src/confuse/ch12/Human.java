package confuse.ch12;

class Annoyance extends RuntimeException {}
class Sneeze extends Annoyance {}

public class Human {
    public static void main(String[] args) {
//        try {
//            throw new Sneeze();
//        } catch (Sneeze s) {
//            System.out.println("Caught Sneeze");
//        } catch (Annoyance a) {
//            System.out.println("Caught Annoyance");
//        }
//
//        try {
//            throw new Sneeze();
//        } catch (Annoyance a) {
//            System.out.println("Caught Annoyance");
//        }
        try {
            throw new RuntimeException();
        } catch (RuntimeException re) {
            try {
                throw re.getCause();
            } catch (Sneeze e) {
                e.printStackTrace();
            } catch (Annoyance e) {
                e.fillInStackTrace();
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }
}
