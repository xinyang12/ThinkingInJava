package practice.ch5;

class Tank {
    String status = "full";

    Tank() {}

    protected void finalize() {
        if (!status.equals("empty")) {
            System.out.println("not equals");
        }
    }
}

public class Practice12 {

    // 看来finalize()是分别针对可以被垃圾回收䣌各个对象的，
    // 而System.gc()是针对未被垃圾回收的对象
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.finalize();
    }

}
