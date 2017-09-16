package confuse.ch2;

class Value {
    int i;
    // 重写equals才能为true，否则为false
    // 由于equals()的默认行为是比较引用（tij原话)
    public boolean equals(Value test) {
        return this.i == test.i;
    }
}

public class EqualsMethod2 {

    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }


}
