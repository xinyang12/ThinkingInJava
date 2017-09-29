package practice.ch9;

interface face141 {
    void color1();
    void color2();
}

interface face142 {
    void color3();
    void color4();
}

interface face143 {
    void color5();
    void color6();
}

interface face14all extends face141, face142, face143 {
    void color7();
}

class class141 {

}

class class142 extends class141 implements face14all {
    public void color1() {
        System.out.println("color1");
    }
    public void color2() {
        System.out.println("color2");
    }
    public void color3() {
        System.out.println("color3");
    }
    public void color4() {
        System.out.println("color4");
    }
    public void color5() {
        System.out.println("color5");
    }
    public void color6() {
        System.out.println("color6");
    }
    public void color7() {
        System.out.println("color7");
    }
}

abstract class abstract1 {
    void play() {}
}

class abstract2 extends abstract1 {
    void play() {
        System.out.println("play");
    }
}

public class Practice14 {
    public static void testFace1(face141 v) {
        v.color1();
        v.color2();
    }

    public static void testFace2(face142 v) {
        v.color3();
        v.color4();
    }

    public static void testFace3(face143 v) {
        v.color5();
        v.color6();
    }

    public static void testFaceAll(face14all v) {
        v.color7();
    }

    public static void main(String[] args) {
        class142 test = new class142();
        testFace1(test);
        testFace2(test);
        testFace3(test);
        testFaceAll(test);
        abstract1 gg = new abstract2();
        gg.play();
    }
}
