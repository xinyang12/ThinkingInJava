package confuse.ch12;

class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}

// 定义一个异常
class ConstructionException extends Exception {}

class NeedsCleanup2 extends NeedsCleanup {
    public NeedsCleanup2() throws ConstructionException {}
}

public class CleanupIdiom {
    public static void main(String[] args) {
        NeedsCleanup nc1 = new NeedsCleanup();
        try {

        } finally {
            nc1.dispose();
        }


        // 如果构造函数不可能出现异常，那么就可以成组地创建新对象
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {

        } finally {
            nc3.dispose();
            nc2.dispose();
        }

        // 如果构造函数可能对出现异常，那么就必须要一个一个地创建新对象
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {

                } finally {
                    nc5.dispose();
                }
            } catch (ConstructionException e) {
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch (ConstructionException e) {
            System.out.println(e);
        }
    }
}
