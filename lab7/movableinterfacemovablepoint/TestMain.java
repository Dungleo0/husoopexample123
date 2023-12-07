package lab7.movableinterfacemovablepoint;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(5,4,1,2);
        System.out.println(point);
        point.moveDown();
        point.moveRight();
        System.out.println(point);
    }
}
