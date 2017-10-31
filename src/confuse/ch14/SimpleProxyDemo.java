package confuse.ch14;

import static util.Print.print;

/**
 * 先定义一个接口
 */
interface Interface {
    void doSomething();
    void somethingElse(String arg);
}

/**
 * 然后实现这个接口
 */
class RealObject implements Interface {
    public void doSomething() {
        print("doSomething");
    }
    public void somethingElse(String arg) {
        print("somethingElse " + arg);
    }
}

/**
 * 再实现一个接口
 */
class SimpleProxy implements Interface {
    public static int countForSomething = 0;
    public static int countForSomethingElse = 0;
    // 里面定义一个接口域
    private Interface proxied;
    // 构造器
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    // 然后实现该有的方法，调用代理的方法
    public void doSomething() {
        print("SimpleProxy doSomething");
        ++countForSomething;
        proxied.doSomething();
    }
    public void somethingElse(String arg) {
        print("SimpleProxy somethingElse " + arg);
        ++countForSomethingElse;
        proxied.somethingElse(arg);
    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
//        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
        consumer(new SimpleProxy(new RealObject()));
        System.out.println("Something is " + SimpleProxy.countForSomething);
        System.out.println("SomethingElse is " + SimpleProxy.countForSomethingElse);
    }
}
