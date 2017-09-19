package confuse.ch6;

class Sundae {
    private Sundae() {}

    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream {

    public static void main(String[] args) {
        // 由于Sundae的构造器是private，所以不能通过构造器来新建对象
        // 另一个效果是：既然默认构造器是唯一定义的构造器，并且它是private的，
        // 那么它将阻碍对此类的继承
        // Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }

}
