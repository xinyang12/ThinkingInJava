package confuse.ch10;

public interface Selector {
    // 末尾
    boolean end();
    // 当前元素
    Object current();
    // 下一个元素
    void next();
}
