package lab5.circleandcylindersubclass;

public class Cylinder extends Circle {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius, String color, Circle base, double height) {
        super(radius, color);
        this.base = base;
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + super.toString() +
                " base=" + base +
                ", height=" + height +
                '}';
    }
}

