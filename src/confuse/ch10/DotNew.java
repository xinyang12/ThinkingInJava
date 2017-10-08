package confuse.ch10;

public class DotNew {
    public class Inner {}
    public Inner getInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
        DotNew dn2 = new DotNew();
        DotNew.Inner dni2 = dn2.getInner();
    }
}
