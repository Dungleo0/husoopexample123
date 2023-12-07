package lab5.circleandcylindersubclass;

public class TestMain {

    public static void main(String[] args) {
        Circle circle = new Circle(5.0,"Blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(8.0,"Black",circle,2.0);

        System.out.println(cylinder);

        cylinder.setHeight(1.0);
        cylinder.setBase(new Cylinder(3.0,"Green",circle,cylinder.getHeight()));
        System.out.println(cylinder);

    }
}
