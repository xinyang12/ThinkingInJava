package practice.ch9;

interface face1 {
    void method1();
}

interface face2 extends face1 {
    void method2();
}

interface face3 extends face1 {
    void method3();
}

interface face4 extends face2, face3 {

}

public class Practice13 {
}
