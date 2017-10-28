package confuse.ch14;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntclass = int.class;
        genericIntclass = Integer.class;
        intClass = double.class;

        // genericIntclass = double.class;
    }
}
