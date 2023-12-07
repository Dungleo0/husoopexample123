package lab5.shapeandcubclasscircleandractangle;

public class TestMain {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape("Blue",true);
        shape1.setFilled(false);
        System.out.println(shape1);

        System.out.println("CIRCLE_____________");
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(4.0,"black",true);
        System.out.println(circle1);
        System.out.println("Area is: "+circle1.getArea());
        System.out.println("Perimeter is: "+circle1.getPerimeter());

        System.out.println("RECTANGLE______________");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1 = new Rectangle(3.0,5.0,"yellow",true);
        System.out.println(rectangle1);

        System.out.println("Area is: "+rectangle1.getArea());
        System.out.println("Perimeter is: "+rectangle1.getPerimeter());

        System.out.println("SQUARE___________");

        Square square = new Square(5.0,"Blue",true);
        square.setSide(7.0);
        square.setWidth(4.0);
        square.setLength(8.0);
        System.out.println(square);
    }
}
