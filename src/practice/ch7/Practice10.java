package practice.ch7;

class Component1 {
    Component1(int i) {
        System.out.println("Component1 cons");
    }
    void dispose() {
        System.out.println("com1 dis");
    }
}

class Component2 {
    Component2(int i) {
        System.out.println("Component2 cons");
    }
    void dispose() {
        System.out.println("com2 dis");
    }
}

class Component3 {
    Component3(int i) {
        System.out.println("Component3 cons");
    }
    void dispose() {
        System.out.println("com3 dis");
    }
}

class Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;
    Root() {
        component1 = new Component1(1);
        component2 = new Component2(1);
        component3 = new Component3(1);
        System.out.println("Root cons");
    }
    void dispose() {
        component1.dispose();
        component2.dispose();
        component3.dispose();
        System.out.println("root dis");
    }
}

class Stem extends Root {
//    Component1 component1;
//    Component2 component2;
//    Component3 component3;
    Stem() {
        component1 = new Component1(1);
        component2 = new Component2(1);
        component3 = new Component3(1);
        System.out.println("Stem cons");
    }
    void dispose() {
        component1.dispose();
        component2.dispose();
        component3.dispose();
        System.out.println("stem dis");
        super.dispose();
    }
}

public class Practice10 {
    public static void main(String[] args) {
        Stem stem = new Stem();
        try {

        } finally {
            stem.dispose();
        }
    }
}
