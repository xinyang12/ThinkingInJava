package confuse.ch14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static util.Print.print;

public class ShowMethods {
    /**
     * 默认构造函数也会显示，但是改成不是public的就不会显示了
     */
//    public ShowMethods() {}
    private static String usage =
            "usage:\n" +
            "ShowMethods qualified.class.name\n" +
            "To show all methods in class or:\n" +
            "ShowMethods qualified.class.name word\n" +
            "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");
    public static void main(String[] args) {
        if (args.length < 1) {
            print(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if (args.length == 1) {
                for (Method method : methods) {
                    print(p.matcher(method.toString()).replaceAll(""));
                }
                System.out.println("---------------------------------");
                for (Constructor ctor : ctors) {
                    print(p.matcher(ctor.toString()).replaceAll(""));
                }
                lines = methods.length + ctors.length;
            } else {
                for (Method method : methods) {
                    if (method.toString().indexOf(args[1]) != -1) {
                        print(p.matcher(method.toString()).replaceAll(""));
                        ++lines;
                    }
                    for (Constructor ctor : ctors) {
                        if (ctor.toString().indexOf(args[1]) != -1) {
                            print(p.matcher(ctor.toString()).replaceAll(""));
                            ++lines;
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            print("No such class: " + e);
        }
    }
}
