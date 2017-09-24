package practice.ch8;

class AlertStatus {
    void color() {
        System.out.println("base color");
    }
}

class ShitStatus extends AlertStatus {
    void color() {
        System.out.println("shit color");
    }
}

class FuckStatus extends AlertStatus {
    void color() {
        System.out.println("fuck color");
    }
}

class DamnStatus extends AlertStatus {
    void color() {
        System.out.println("damn color");
    }
}

class StarShip {
    private AlertStatus alertStatus = new ShitStatus();
    void showColor() {
        alertStatus.color();
    }
    void changeStatusToShit() {
        alertStatus = new ShitStatus();
    }
    void changeStatusToFuck() {
        alertStatus = new FuckStatus();
    }
    void changeStatusToDamn() {
        alertStatus = new DamnStatus();
    }
}

public class Practice16 {
    public static void main(String[] args) {
        StarShip starShip = new StarShip();
        starShip.showColor();
        starShip.changeStatusToShit();
        starShip.showColor();
        starShip.changeStatusToFuck();
        starShip.showColor();
        starShip.changeStatusToDamn();
        starShip.showColor();
    }
}
