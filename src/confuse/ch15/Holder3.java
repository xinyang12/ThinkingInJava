package confuse.ch15;

/**
 * 使用类型参数，用尖括号括住，放在类名后面
 * 然后在使用这个类的是时候，再使用实际的类型替换此类型参数
 * @param <T>
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a) {
        this.a = a;
    }
    public void set(T a) {
        this.a = a;
    }
    public T get() {
        return a;
    }
    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        Automobile a = h3.get();
//        h3.set("Not an Automobile");
//        h3.set(1);
    }
}
