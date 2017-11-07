package confuse.ch15;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        // 这个泛型T不能这么写，报错了
        try {
//            if (a instanceof EnumSet<T>) {
//                Set<T> result = ((EnumSet<T>)a).clone();
//                result.addAll(b);
//                return result;
//            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }
    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<>(superset);
        result.removeAll(subset);
        return result;
    }
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}
