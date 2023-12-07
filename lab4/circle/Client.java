package lab4.circle;

public class Client {

    public static void main(String[] args) {

        Circle circle1 = new Circle();

        System.out.println("The circle has radius of "
                + circle1.getRadius() + " and area of " + circle1.getArea());

        System.out.println("The circle circumference is: " + circle1.getCircumference());

        System.out.println(circle1);

        System.out.println("---------------------------");

        Circle circle2 = new Circle(2.0);

        System.out.println(circle2);

        System.out.println("The circle has radius of "
                + circle2.getRadius() + " and area of " + circle2.getArea());

        System.out.println("The circle circumference is: " + circle2.getCircumference());
        circle2.setRadius(5.0);
        System.out.println("Before change radius...");
        System.out.println(circle2);


    }
}
