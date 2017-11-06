package confuse.ch15;

import pets.Person;
import pets.Pet;

import java.util.List;
import java.util.Map;

public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) {}
    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }
}
