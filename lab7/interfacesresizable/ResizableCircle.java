package lab7.interfacesresizable;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" + super.toString() +
                " radius=" + radius +
                '}';
    }

    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}
