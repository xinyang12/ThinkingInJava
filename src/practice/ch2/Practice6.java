package practice.ch2;

class Dog {
    String name;
    String says;
}

public class Practice6 {

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "spot";
        spot.says = "Ruff!";

        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";

        Dog newDog = spot;
        System.out.println(spot == newDog);
        System.out.println(spot.equals(newDog));
    }

}
