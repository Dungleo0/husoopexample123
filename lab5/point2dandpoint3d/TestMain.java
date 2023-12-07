package lab5.point2dandpoint3d;

public class TestMain {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(4.0f,5.0f);
        System.out.println("Point2D is: ");
        System.out.println(point2D);

        point2D.setXY(3.0f,6.0f);
        System.out.println(point2D);
        System.out.println("--------------------");
        Point3D point3D = new Point3D(3.0f,4.0f,5.0f);
        System.out.println("Point3D is: ");
        System.out.println(point3D);

        point3D.setXYZ(1.0f,2.0f,3.0f);
        System.out.println("After change:");
        System.out.println(point3D.getXYZ()[0]+" "+
                            point3D.getXYZ()[1]
                            +" "+point3D.getXYZ()[2]);
    }
}
