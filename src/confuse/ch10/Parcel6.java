package confuse.ch10;

public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingShip {
                private String id;
                TrackingShip(String s) {
                    id = s;
                }
                String getSlip() {
                    return id;
                }
            }
            TrackingShip ts = new TrackingShip("slip");
            String s = ts.getSlip();
        }
    }
    public void track() {
        internalTracking(true);
    }
    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
