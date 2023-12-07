package lab4.mylineandmypoint;

public class TestMain {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(3, 4);

        System.out.println(point1);
        System.out.println(point2);

        MyLine myLine1 = new MyLine(point1,point2);
        MyLine myLine2 = new MyLine(1,2,3,4);
        System.out.println(myLine2);

        System.out.println(myLine1);

        System.out.println("Line 1 length: " + myLine2.getLength());
        System.out.println("Line 1 gradient: " + myLine2.getGradient());

        System.out.println("Line 2 length: " + myLine1.getLength());
        System.out.println("Line 2 gradient: " + myLine1.getGradient());
    }
}
