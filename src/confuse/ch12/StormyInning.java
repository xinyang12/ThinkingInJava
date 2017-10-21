package confuse.ch12;

// 定义三个异常
class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
class UmpireArgument extends Exception {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {

    }
    public abstract void atBat() throws Strike, Foul;
    public void walk() {}
}

// 再定义三个异常
class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    void event() throws RainedOut;
    void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    // 可以添加新异常，但必须有基类的异常类型
    public StormyInning() throws RainedOut, BaseballException {}
    public StormyInning(String s) throws Foul, BaseballException {}

    // 基类没有这个异常，就不能在子类中添加异常
//    public void walk() throws PopFoul {}

    // Interface CANNOT add exceptions to existing methods from the base class:
//    public void event() throws RainedOut {}

    public void rainHard() throws RainedOut {}

    public void event() {}

    public void atBat() throws PopFoul {}

    public void testNewException() throws UmpireArgument {}

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}
