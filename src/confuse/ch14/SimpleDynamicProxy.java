package confuse.ch14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 实现一个接口
 */
class DynamicProxyHandler implements InvocationHandler {
    public static int count = 0;
    // 定义一个代理域
    private Object proxied;

    // 构造器
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
        ++count;
        if (args != null) {
            for (Object arg : args) {
                System.out.println(" " + args);
            }
        }
        return method.invoke(proxied, args);
    }
}

public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[] {
                        Interface.class
                },
                new DynamicProxyHandler(real)
        );
        consumer(proxy);
        // 这里每调用一次就是把所有方法都调用了一次，因此次数要加上方法数，而不是1
        consumer(proxy);
        System.out.println("count is " + DynamicProxyHandler.count);
    }
}
