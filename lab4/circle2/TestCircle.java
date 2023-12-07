package lab4.circle2;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The Circle has radius of: "+circle1.getRadius()+" and area of "+circle1.getArea());

        System.out.println();

        Circle circle2 = new Circle(2.0);
        System.out.println("The Circle has radius of: "+circle2.getRadius()+" and area of "+circle2.getArea());

        System.out.println();

        Circle circle4 = new Circle();
        circle4.setRadius(5.5);
        System.out.println("Radius is: "+circle4.getRadius());
        circle4.setColor("green");
        System.out.println("The color is: "+circle4.getColor());
        System.out.println(circle4);

        System.out.println();

        Circle circle5 = new Circle(5.5);
        System.out.println(circle5);
    }
}
