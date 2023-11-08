package at.dichter.design_patterns.observer_test;

import java.util.ArrayList;
import java.util.List;

public class IDManager {
    private static IDManager instance = null;
    private int observerID = 0;
    public static IDManager getInstance() {
        if(instance == null) instance = new IDManager();
        return instance;
    }

    public int getID() {
        observerID++;
        return observerID - 1;
    }
}
