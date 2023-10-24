package at.dichter.design_patterns.factory;

public class ShapeNotFoundException extends Exception{
    public ShapeNotFoundException(String message) {
        super(message);
    }
}
