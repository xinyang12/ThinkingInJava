package practice.ch10;

import confuse.ch10.Event;
import confuse.ch10.GreenhouseControls;

public class GreenhouseController extends GreenhouseControls {
    private boolean watermist = false;
    public class WatermistOn extends Event {
        public WatermistOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            watermist = true;
        }
        public String toString() {
            return "Watermist is on";
        }
    }

    public class WatermistOff extends Event {
        public WatermistOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            watermist = false;
        }
        public String toString() {
            return "Watermist is off";
        }
    }
}
