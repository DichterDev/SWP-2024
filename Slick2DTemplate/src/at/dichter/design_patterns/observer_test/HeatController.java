package at.dichter.design_patterns.observer_test;

public class HeatController extends Observer{
    @Override
    public void notify(float temperatur) {
        System.out.println("I am " + this.getClass().getSimpleName() + ": " + temperatur);
    }
}
