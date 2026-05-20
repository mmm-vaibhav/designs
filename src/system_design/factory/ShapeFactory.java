package system_design.factory;

public class ShapeFactory {

    public Shape getShapeObject(String shapeValue) {
        switch (shapeValue) {
            case "Circle":
                return new Circle();
            case  "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
