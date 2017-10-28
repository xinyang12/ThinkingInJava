package practice.ch14;

class A {
    private int a;
}
class B extends A {
    private int b;
}
class C extends B {
    public int c;
}

public class Practice8 {
    public static void Hierarchy(Object o) {
        if (o.getClass().getSuperclass() != null) {
            System.out.println(o.getClass() + " is a subclass of " + o.getClass().getSuperclass());
            try {
                Hierarchy(o.getClass().getSuperclass().newInstance());
            } catch (InstantiationException e) {
                System.out.println("Unable to instantiate obj");
            } catch (IllegalAccessException e) {
                System.out.println("Unable to access");
            }
        }
    }

    public static void showHierarchy(Object o) {
        Object[] objects = o.getClass().getDeclaredFields();
        if (objects.length == 0) {
            System.out.println(o.getClass() + " has no fields");
        }
        if (objects.length > 0) {
            System.out.println("Field(s) of " + o.getClass() + ":");
            for (Object j : objects) {
                System.out.println(j);
            }
        }
        if (o.getClass().getSuperclass() != null) {
            System.out.println(o.getClass().getDeclaredFields());
            try {
                showHierarchy(o.getClass().getSuperclass().newInstance());
            } catch (InstantiationException e) {
                System.out.println("Unable to instantiate obj");
            } catch (IllegalAccessException e) {
                System.out.println("Unable to access");
            }
        }
    }

    public static void main(String[] args) {
//        Hierarchy(new C());
        showHierarchy(new C());
    }
}
