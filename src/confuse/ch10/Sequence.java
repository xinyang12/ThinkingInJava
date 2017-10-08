package confuse.ch10;

// “迭代器”接口
//interface Selector {
//    // 末尾
//    boolean end();
//    // 当前元素
//    Object current();
//    // 下一个元素
//    void next();
//}

public class Sequence {
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
    public Selector selector() {
        return new SequenceSelector();
    }
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
    }
}
