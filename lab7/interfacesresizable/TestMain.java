package lab7.interfacesresizable;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(5.0);
        System.out.println(resizableCircle);
        resizableCircle.resize(50);
        System.out.println(resizableCircle);

    }
}
