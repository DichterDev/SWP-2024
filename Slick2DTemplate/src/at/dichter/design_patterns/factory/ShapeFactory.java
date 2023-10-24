package at.dichter.design_patterns.factory;

public class ShapeFactory {
    public Shape getShape(String shapeType) throws ShapeNotFoundException {
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("OVAL")) {
            return new Oval();
        }

        throw new ShapeNotFoundException("Shape not found");
    }
}
