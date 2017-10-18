package practice.ch11;

import pets.Pet;
import pets.Pets;

import java.util.*;

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

class NonCollectionSequence extends PetSequence {
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

    public Iterable<Pet> normalIterator() {
        return new Iterable<Pet>() {
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = 0;
                    public boolean hasNext() {
                        return current < pets.length;
                    }
                    public Pet next() {
                        return pets[current++];
                    }
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomIterator() {
        return new Iterable<Pet>() {
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    /**
     * 需要的Iterable，然后实现
     * 因此就要实现iterator()方法
     * 然后在方法中返回Iterator
     * @return
     */
    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
          public Iterator<Pet> iterator() {
              return new Iterator<Pet>() {
                  int current = pets.length - 1;
                  public boolean hasNext() {
                      return current > -1;
                  }
                  public Pet next() {
                      return pets[current--];
                  }
                  public void remove() {
                      throw new UnsupportedOperationException();
                  }
              };
          }
        };
    }
}

public class Practice32 {
    public static void main(String[] args) {
        NonCollectionSequence nonCollectionSequence = new NonCollectionSequence();
        Iterator<Pet> iterator = nonCollectionSequence.iterator();
        System.out.println("-----------------------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------------");
        for (Pet p : nonCollectionSequence.reversed()) {
            System.out.println(p);
        }
        System.out.println("-----------------------------");
        for (Pet p : nonCollectionSequence.normalIterator()) {
            System.out.println(p);
        }
        System.out.println("-----------------------------");
        for (Pet p : nonCollectionSequence.randomIterator()) {
            System.out.println(p);
        }
    }
}
