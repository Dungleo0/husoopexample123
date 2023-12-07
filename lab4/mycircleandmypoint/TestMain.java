package lab4.mycircleandmypoint;

public class TestMain {

    public static void main(String[] args) {

        MyCircle c1 = new MyCircle(5, 10, 2);
        MyCircle c2 = new MyCircle(new MyPoint(1, 2), 3);

        System.out.println(c1);
        System.out.println("Area is: " + c1.getArea());
        System.out.println("radius is: " + c1.getRadius());
        System.out.println("Circumference is: " + c1.getCircumference());
        c1.setCenter(new MyPoint(4, 8));
        System.out.println("X is: after change: " + c1.getCenterX());
        for (int i = 0; i < c1.getCenterXY().length; i++) {
            System.out.println(c1.getCenterXY()[i]);
        }
        System.out.println();

        System.out.println(c2);
        System.out.println(c2.getArea());
        System.out.println(c2.getRadius());
        System.out.println(c2.getCircumference());
    }
}
