package lab7.movableinterfaceandmovablepointandcircle;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2,3,1,1);
        point.moveRight();
        point.moveLeft();
        point.moveUp();
        point.moveDown();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(3,4,1,1,4);
        System.out.println(circle);
    }
}
