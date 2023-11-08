package at.dichter.design_patterns.factory_test;

public class LinusTorvaldAlgo implements Algorithm {
    @Override
    public void printName() {
        System.out.println(this.getClass().getSimpleName());
    }
}
