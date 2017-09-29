package practice.ch9;

import confuse.ch9.Apply;
import confuse.ch9.Processor;

// 这个题目有点意思 **************************
class StringHandler {
    String process(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; --i) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    String name() {
        return getClass().getSimpleName();
    }
}

class ProxyHandler implements Processor {
    StringHandler sh;
    ProxyHandler(StringHandler sh) {
        this.sh = sh;
    }
    public String name() {
        return sh.name();
    }
    public String process(Object input) {
        return sh.process((String)input);
    }
}

public class Practice11 {
    public static void main(String[] args) {
        String s = "wangxinyang";
        Apply.process(new ProxyHandler(new StringHandler()), s);
    }
}
