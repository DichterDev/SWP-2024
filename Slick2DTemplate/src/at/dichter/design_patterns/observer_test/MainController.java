package at.dichter.design_patterns.observer_test;

public class MainController {
    public static void main(String[] args) {
        HeatController hc1 = new HeatController();
        HeatController hc2 = new HeatController();
        HeatController hc3 = new HeatController();
        BlindController bc1 = new BlindController();
        BlindController bc2 = new BlindController();
        BlindController bc3 = new BlindController();

        Thermometer thermometer = new Thermometer();

        thermometer.addObserver(hc1);
        thermometer.addObserver(hc3);
        thermometer.addObserver(bc1);
        thermometer.addObserver(bc2);

        for(int i = 0; i < 30; i++) {
            thermometer.setRandomTemperatur();
        }
    }
}
