package practice.ch5;

enum Cash {
    YIMAO, WUMAO, YIKUAI, WUKUAI, SHIKUAI, ERSHI, WUSHI, YIBAI
}

public class Practice21 {

    Cash test;

    public static void main(String[] args) {
        for (Cash tmp : Cash.values()) {
            System.out.println(tmp.ordinal() + " and " + tmp);
            Practice21.describe(tmp);
        }
    }

    static void describe(Cash test) {
        switch(test) {
            case YIMAO:
                System.out.println("一毛钱");
                break;
            case WUMAO:
                System.out.println("五毛钱");
                break;
            case YIKUAI:
                System.out.println("一块钱");
                break;
            case WUKUAI:
                System.out.println("五块钱");
                break;
            case SHIKUAI:
                System.out.println("十块钱");
                break;
            case ERSHI:
                System.out.println("二十");
                break;
            case WUSHI:
                System.out.println("五十");
                break;
            case YIBAI:
                System.out.println("一百");
                break;
            default:
                System.out.println("出错啦");
        }
    }

}
