package at.dichter.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void updateAllObservers() {
        for(var o : observers) {
            o.update();
        }
    }
}
