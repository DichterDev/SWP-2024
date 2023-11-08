package at.dichter.design_patterns.observer_test;

public abstract class Observer {
    private int id;

    public Observer() {
        IDManager idm = IDManager.getInstance();
        this.id = idm.getID();
    }

    public int getId() { return id; }
    public abstract void notify(float temperatur);
}
