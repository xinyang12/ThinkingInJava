package confuse.ch14;

import static util.Print.print;

class Candy {
    static {
        print("Loading Candy");
    }
}

class Gum {
    static {
        print("Loading Gum");
    }
}

class Cookie {
    static {
        print("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
//        print("inside main");
//        new Candy();
//        print("After creating Candy");
//        // 要写全限定名，不能写路径名！！！
//        try {
//            Class.forName("confuse.ch14.Gum");
//        } catch (ClassNotFoundException e) {
//            print("Couldn't find Gum");
//        }
//        print("After Class.forName(\"Gum\")");
//        new Cookie();
//        print("After creating Cookie");
        if (args.length == 0) {
            System.out.println("wrong parameter");
        }
        for (int i = 0; i < args.length; ++i) {
            Class tmp;
            try {
                tmp = Class.forName("confuse.ch14." + args[i]);
                Class c = tmp.getSuperclass();
                Object obj = null;
                try {
                    obj = c.newInstance();
                } catch (InstantiationException e) {
                    print("Cannot instantiate");
                    System.exit(1);
                } catch (IllegalAccessException e) {
                    print("Cannot access");
                    System.exit(1);
                }
            } catch (ClassNotFoundException e) {
                print("Couldn't find " + args[i]);
            }
        }
    }
}
