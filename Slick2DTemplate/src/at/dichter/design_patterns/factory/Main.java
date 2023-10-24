package at.dichter.design_patterns.factory;

public class Main {
    public static void main(String[] args) throws ShapeNotFoundException {
        ShapeFactory shapeFactory = new ShapeFactory();

        Circle c1 = (Circle) shapeFactory.getShape("CIRCLE");
        c1.draw();
    }
}
