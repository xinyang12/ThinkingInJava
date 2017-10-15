package practice.ch11;

import confuse.ch11.Stack;

public class Practice15 {
    public static void main(String[] args) {
//        Stack<Character> s = new Stack<>();
//        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
//        int i = 0;
//        while (i < str.length()) {
//            if (str.charAt(i) == '+') {
//                s.push(str.charAt(i + 1));
//            }
//            if (str.charAt(i) == '-') {
//                s.pop();
//            }
//            ++i;
//        }
//        System.out.println(s.toString());
        Stack<Character> sc = new Stack<Character>();
        sc.push('U');
        sc.push('n');
        sc.push('c');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push('e');
        sc.push('r');
        sc.push('t');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push('a');
        sc.push('i');
        sc.push('n');
        sc.push('t');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push(' ');
        System.out.print(sc.pop());
        sc.push('r');
        sc.push('u');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        sc.push('l');
        sc.push('e');
        sc.push('s');
        System.out.print(sc.pop());
        System.out.print(sc.pop());
        System.out.print(sc.pop());
    }
}
