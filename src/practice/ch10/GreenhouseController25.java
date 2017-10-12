package practice.ch10;

import confuse.ch10.Event;
import confuse.ch10.GreenhouseControls;

public class GreenhouseController25 {
    public static void main(String[] args) {
        GreenhouseController gc = new GreenhouseController();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new WatermistOn(1000),
                gc.new WatermistOff(1400),
                gc.new ThermostatNight(1600)
        };
        gc.addEvent(gc.new Restart(2000,eventList));
        if (args.length == 1) {
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])
                    )
            );
        }
        gc.run();
    }
}
