package practice.ch7;

import confuse.ch7.Detergent;

public class Practice2 extends Detergent {
    public void scrub() {
        super.scrub();
//        append("scrub() in Third class");
    }
    public void sterilize() {
//        append("This is sterilize()");
    }

    public static void main(String[] args) {
        Practice2 practice2 = new Practice2();
        practice2.scrub();
        practice2.sterilize();
        System.out.println(practice2);
    }
}
