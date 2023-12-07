package lab4.mytriangleandmypoint;

public class TestMain {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(5, 2, 4, 7, 9, 3);
        MyTriangle t2 = new MyTriangle(new MyPoint(4, 2), new MyPoint(5, 8), new MyPoint(-2, -5));
        System.out.println(t1);
        System.out.println(t1.getPerimeter());
        t1.printType();
        System.out.println(t2);
        System.out.println(t2.getPerimeter());
        t2.printType();
    }
}
