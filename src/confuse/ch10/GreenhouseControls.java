package confuse.ch10;

public class GreenhouseControls extends Controller {
    // 控制灯光
    private boolean light = false;
    // 开灯事件
    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            light = true;
        }
        public String toString() {
            return "Light is on";
        }
    }

    // 关灯事件
    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            light = false;
        }
        public String toString() {
            return "Light is off";
        }
    }

    // 控制水源
    private boolean water = false;
    // 开水事件
    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            water = true;
        }
        public String toString() {
            return "Greenhouse water is on";
        }
    }

    // 关水事件
    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            water = false;
        }
        public String toString() {
            return "Greenhouse water is off";
        }
    }

    // 温度调节器
    private String thermostat = "Day";
    // 夜晚
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }
        public void action() {
            thermostat = "Night";
        }
        public String toString() {
            return "Thermostat on night setting";
        }
    }

    // 白天
    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }
        public void action() {
            thermostat = "Day";
        }
        public String toString() {
            return "Thermostat on day setting";
        }
    }

    // 响铃
    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() {
            return "Bing!";
        }
    }

    // 重新启动
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) {
                addEvent(e);
            }
        }
        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        public String toString() {
            return "Restarting system";
        }
    }

    // 关闭
    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }
        public void action() {
            System.exit(0);
        }
        public String toString() {
            return "Terminating";
        }
    }
}
