package practice.ch11;

import pets.Rodent;

import java.util.ArrayList;
import java.util.List;

class Gerbil extends Rodent {
    int gerbilNumber;
    public Gerbil() {
        super();
    }
    public Gerbil(int number) {
        gerbilNumber = number;
    }
    public void hop() {
        System.out.println(gerbilNumber);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        List<Gerbil> list = new ArrayList<>();
        list.add(new Gerbil(1));
        list.add(new Gerbil(2));
        list.add(new Gerbil(3));

        for (int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i));
//            list.get(i).hop();
        }
    }
}
