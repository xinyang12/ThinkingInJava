package practice.ch12;

public class Practice5 {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            try {
                ++count;
                throw new Exception();
            } catch (Exception e) {
                System.out.println("count is " + count);
                e.printStackTrace();
            }
            if (count > 100) {
                break;
            }
        }
        System.out.println(count);
    }
}
