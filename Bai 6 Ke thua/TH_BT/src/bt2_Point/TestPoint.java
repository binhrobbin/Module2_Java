package bt2_Point;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point2D d1 = new Point2D();
        System.out.println("Point2D: "+d1);
        Point2D d2 = new Point2D(2.5f,3.7f);
        System.out.println("Point2D: "+d2);
        d1.setXY(1.1f,1.5f);
        System.out.println("Point2D: "+d1);
        System.out.println("Mảng xy là: "+ Arrays.toString(d1.getXY()));

        //test 3D
        Point3D e1 = new Point3D();
        System.out.println("Point2D: "+e1);
        Point3D e2 = new Point3D(1.5f);
        System.out.println("Point2D: "+e2);
        Point3D e3 = new Point3D(1.5f,2f,3f);
        System.out.println("Point2D: "+e3);
        System.out.println("Mảng xyz là: "+ Arrays.toString(e3.getXYZ()));
    }
}
