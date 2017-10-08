package confuse.ch10;

public class Parcel10 {
    // TODO 此处的两个参数没有使用final，也没有报错。。
    public Destination destination(String dest, float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget!");
                }
            }
            private String label = dest;
            public String readLabel() {
                return label;
            }
        };
    }
    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }
}
