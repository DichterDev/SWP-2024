package at.dichter.design_patterns.observer_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thermometer {
    private float temperatur = 0f;
    List<Observer> observers = new ArrayList<>();

    public void setRandomTemperatur() {
        Random rnd = new Random();
        this.temperatur = rnd.nextInt(40) + rnd.nextFloat();
        if(temperatur >= 20) _notifyAll();
    }

    private void _notifyAll() {
        for (var o : observers) {
            o.notify(temperatur);
        }
    }

    public void addObserver(Observer o) {
        this.observers.add(o);
    }
}
