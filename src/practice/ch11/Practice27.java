package practice.ch11;

import java.util.LinkedList;
import java.util.Queue;

class Command {
    String name;
    Command(String s) {
        name = s;
    }
    void operation() {
        System.out.println(name);
    }
}

class Prac27Class {
    Queue<Command> makeQ() {
        Queue<Command> queue = new LinkedList<>();
        for (int i = 0; i < 10; ++i) {
            queue.offer(new Command(i + " "));
        }
        return queue;
    }
}

public class Practice27 {
    public static void main(String[] args) {
        Prac27Class p = new Prac27Class();
        Queue<Command> qc = p.makeQ();
        while (qc.peek() != null) {
            qc.poll().operation();
        }
    }
}
