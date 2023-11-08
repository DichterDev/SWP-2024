package at.dichter.design_patterns.factory_test;

public class OSNotFoundException extends Exception{
    public OSNotFoundException() {
        super("Error: Operating System not found");
    }
}
