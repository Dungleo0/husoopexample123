package lab9.decoratorpattern.shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(circle);
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();

        redCircle.draw();

        redRectangle.draw();


    }
}
