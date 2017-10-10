package practice.ch10;

import confuse.ch10.Selector;

class Sequence {
    private Object[] items;
    // next表示第一个空位置
    private int next = 0;
    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }
    // 正向迭代器
    private class SequenceSelector implements Selector {
        private int i = 0;
        // 继承上面的接口，判断当前位置是否是最后一个位置
        public boolean end() {
            return i == items.length;
        }
        // 返回当前的元素
        public Object current() {
            return items[i];
        }
        // 下一个元素
        public void next() {
            if (i < items.length) {
                ++i;
            }
        }
        public Sequence getSequence() {
            return Sequence.this;
        }
    }
    // 逆向迭代器
    private class ReverseSelector implements Selector {
        private int i = items.length - 1;
        public boolean end() {
            return i == -1;
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if (i >= 0) {
                --i;
            }
        }
        public Sequence getSequence() {
            return Sequence.this;
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public Selector reverseSelector() {
        return new ReverseSelector();
    }

}

public class Practice22 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; ++i) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println("\n--------------");
        Selector selector1 = sequence.reverseSelector();
        while (!selector1.end()) {
            System.out.print(selector1.current() + " ");
            selector1.next();
        }
    }
}
