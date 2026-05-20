package system_design.factory;

public class FactoryMain {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShapeObject("Rectangle");
        shape.draw();
    }
}
