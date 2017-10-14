package confuse.ch11;

import java.util.*;

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }
    public static void main(String[] args) {
        // Collection
        System.out.println(fill(new ArrayList<String>()));
        // Collection
        System.out.println(fill(new LinkedList<>()));
        // Collection
        System.out.println(fill(new HashSet<>()));
        // Collection
        System.out.println(fill(new TreeSet<>()));
        // Collection
        System.out.println(fill(new LinkedHashSet<>()));
        // Map
        System.out.println(fill(new HashMap<>()));
        // Map
        System.out.println(fill(new TreeMap<>()));
        // Map
        System.out.println(fill(new LinkedHashMap<>()));
    }
}
