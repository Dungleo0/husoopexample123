package lab5.pointandline;

import lab4.mylineandmypoint.MyLine;
import lab4.mylineandmypoint.MyPoint;

public class TestPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(5, 7);
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
