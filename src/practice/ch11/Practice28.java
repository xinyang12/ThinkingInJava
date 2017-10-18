package practice.ch11;

import java.util.PriorityQueue;
import java.util.Random;

public class Practice28 {
    public static void main(String[] args) {
        Random rand = new Random();
        PriorityQueue<Double> p = new PriorityQueue<>();
        for (int i = 0; i < 50; ++i) {
            p.offer(rand.nextDouble());
        }

        while (p.peek() != null) {
            System.out.println(p.poll());
        }
    }
}
