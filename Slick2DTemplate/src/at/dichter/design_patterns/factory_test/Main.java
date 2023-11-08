package at.dichter.design_patterns.factory_test;

public class Main {
    public static void main(String[] args) throws OSNotFoundException {
        AlgoFactory factory = new AlgoFactory();
        Algorithm algo = factory.getAlgo("Windows");

        algo.printName();
    }
}
