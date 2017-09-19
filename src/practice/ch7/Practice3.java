package practice.ch7;

class Art {
    Art() {
        System.out.println("art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Practice3 extends Drawing {
//    public Practice3() {
//        System.out.println("Cartoon constructor");
//    }
    public static void main(String[] args) {
        Practice3 x = new Practice3();
    }
}
