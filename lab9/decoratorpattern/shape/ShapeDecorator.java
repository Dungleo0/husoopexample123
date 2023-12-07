package lab9.decoratorpattern.shape;

public class ShapeDecorator implements Shape{
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        System.out.println("Drawing shape new ");
    }

}
