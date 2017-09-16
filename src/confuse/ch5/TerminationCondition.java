package confuse.ch5;


class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }
    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut) {
            System.out.println("Error: checked out");
            // 通常，还需要调用 super.finalize()
        }
    }

}

public class TerminationCondition {

    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        Book novel2 = new Book(true);
        novel2.checkIn();
        System.gc();
    }

}
