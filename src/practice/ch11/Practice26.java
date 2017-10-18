package practice.ch11;

import util.TextFile;

import java.util.*;

/**
 * 可以直接用TreeMap排序
 * 这样可在O（n2）内解决
 */
public class Practice26 {
    public static void main(String[] args) {
        List<String> list = new TextFile("src/confuse/ch11/SetOperations.java", "\\W+");
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        int count = 0;
        // 遍历list
        for (String s : list) {
            count++;
            if (!map.containsKey(s)) {
                ArrayList<Integer> i = new ArrayList<>();
                i.add(0, count);
                map.put(s, i);
            } else {
                map.get(s).add(count);
            }
        }

//        System.out.println(map);
//        List<String> answer = new LinkedList<>();
//        int countAnswer = 0;
        Map<Integer, String> answer = new TreeMap<>();
        for (Map.Entry<String, ArrayList<Integer>> m : map.entrySet()) {
            for (Integer i : m.getValue()) {
                answer.put(i, m.getKey());
            }
        }
//        for (int i = 0; i < list.size(); ++i) {
//            for (Map.Entry<String, ArrayList<Integer>> j : map.entrySet()) {
//                for (Integer k : j.getValue()) {
//                    if (k == i) {
//                        answer.add(j.getKey());
//                    }
//                }
//            }
//        }
        System.out.println(answer);
    }
}
