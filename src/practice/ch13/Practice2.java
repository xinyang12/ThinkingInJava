package practice.ch13;

import java.util.ArrayList;
import java.util.List;

/**
 * 如果直接使用this，会递归调用toString()，造成错误
 * 改成super.toString()就好了
 */
public class Practice2 {
    public String toString() {
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }
    public static void main(String[] args) {
        List<Practice2> v = new ArrayList<Practice2>();
        for (int i = 0; i < 10; ++i) {
            v.add(new Practice2());
        }
        System.out.println(v);
    }
}
