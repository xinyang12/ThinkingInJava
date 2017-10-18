package practice.ch11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Practice23 {
    private static Map<Integer, Integer> result = new HashMap<>();
    public static int testRandom() {
        Random rand = new Random();
        Map<Integer, Integer> m =
                new TreeMap<>();
        for (int i = 0; i < 10000; ++i) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        Integer max = 0;
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                index = entry.getKey();
            }
        }
        return index;
//        result.put(max, result.get(max) == null ? 1 : result.get(max) + 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2000; ++i) {
            int max = testRandom();
            result.put(max, result.get(max) == null ? 1 : result.get(max) + 1);
        }
        System.out.println(result);
    }
}
