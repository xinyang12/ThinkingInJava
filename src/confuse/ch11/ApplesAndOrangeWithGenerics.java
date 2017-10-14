package confuse.ch11;

import java.util.ArrayList;

public class ApplesAndOrangeWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            apples.add(new Apple());
        }
//        apples.add(new Orange());
        for (int i = 0; i < apples.size(); ++i) {
            System.out.println(apples.get(i).id());
        }
        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }
}
