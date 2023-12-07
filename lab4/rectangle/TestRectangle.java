package lab4.rectangle;

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        System.out.println("The length and width of rectangle is: "
                + rectangle1.getLength() + ": " + rectangle1.getWidth());

        System.out.println("The area of rectangle is: "+rectangle1.getArea());

        System.out.println("The perimeter of rectangle is: "+rectangle1.getPerimeter());

        System.out.println(rectangle1);

        System.out.println("----------------------");

        Rectangle rectangle2 = new Rectangle(3.0,2.0);

        System.out.println("The length and width of rectangle is: "
                + rectangle1.getLength() + ": " + rectangle2.getWidth());

        System.out.println("The area of rectangle is: "+rectangle2.getArea());

        System.out.println("The perimeter of rectangle is: "+rectangle2.getPerimeter());

        System.out.println("After change attribute...");

        rectangle2.setLength(8.0);
        rectangle2.setWidth(5.0);
        System.out.println(rectangle2);



    }
}
