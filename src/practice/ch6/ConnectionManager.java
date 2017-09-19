package practice.ch6;

class Connection {
    private Integer[] array;
    private Connection() {
        array = new Integer[10];
    }
    static private Connection con1 = new Connection();
    static Connection getInstance() {
        return con1;
    }
}

public class ConnectionManager {
    public static void main(String[] args) {
        Connection con1 = Connection.getInstance();
        System.out.println(con1);
    }
}
