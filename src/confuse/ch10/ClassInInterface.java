package confuse.ch10;

public interface ClassInInterface {
    void howdy();
    // 接口内部默认是public的，因此可以省略
    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("Howdy!");
        }
        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
