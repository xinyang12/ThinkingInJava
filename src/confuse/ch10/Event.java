package confuse.ch10;

public abstract class Event {
    // 事件时间
    private long eventTime;
    // 延迟时间
    protected final long delayTime;
    // 构造函数
    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}
