package practice.ch11;

import pets.Pet;
import pets.Pets;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

class CollectionSequence implements Collection<Pet> {
    // 新建一个Pet数组
    private Pet[] pets = Pets.createArray(8);

    public int size() {
        return pets.length;
    }

    public Object[] toArray() {
        return pets;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends Pet> c) {
        throw new UnsupportedOperationException();
    }

    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    public boolean add(Pet p) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        if (this.size() != 0) {
            for (Pet p : pets) {
                p = null;
            }
        }
    }

    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

public class Practice30 {
    public static void main(String[] args) {

    }
}
