package lab9.decoratorpattern.shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        shape.draw();
    }

    private void setRedBorder() {
        System.out.println("Setting red border");
    }
}
