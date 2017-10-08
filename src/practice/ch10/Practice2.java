package practice.ch10;

import confuse.ch10.Selector;
import confuse.ch10.Sequence;

public class Practice2 {
    private String name;
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        Practice2 practice2 = new Practice2();
        practice2.name = "wangxinyang";
        Practice2 test = new Practice2();
        test.name = "naha";
        sequence.add(practice2);
        sequence.add(test);
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
