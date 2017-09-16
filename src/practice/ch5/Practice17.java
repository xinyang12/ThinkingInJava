package practice.ch5;

public class Practice17 {
    String s;
    Practice17(String s) {
        this.s = s;
        System.out.println("Constructing... and the para is " + s);
    }

    public static void main(String[] args) {
        Practice17[] array = new Practice17[12];
        for (int i = 0; i < array.length; ++i) {
                array[i] = new Practice17("asdf");
        }
    }
}
