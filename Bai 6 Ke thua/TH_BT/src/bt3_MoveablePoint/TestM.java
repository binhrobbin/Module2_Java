package bt3_MoveablePoint;
import java.util.Arrays;

public class TestM {
    public static void main(String[] args) {
        Point d1 = new Point();
        System.out.println("Point: " + d1);
        Point d2 = new Point(2.5f, 3.7f);
        System.out.println("Point: " + d2);
        d1.setXY(1.1f, 1.5f);
        System.out.println("Point: " + d1);
        System.out.println("Mảng xy là: " + Arrays.toString(d1.getXY()));

        //test MoveablePoint
        Point d3 = new MoveablePoint();
        System.out.println("Đối tượng Move: " + d3);
        Point d4 = new MoveablePoint(0.5f,0.5f);
        System.out.println("Đối tượng Move: " + d4);
        MoveablePoint d5 = new MoveablePoint(4f,5f,0.5f,0.5f);
        System.out.println("Đối tượng Move: " + d5);
        System.out.println("Mảng speed là: " + Arrays.toString(d5.getSpeed()));
        System.out.println("Đối tượng sau khi di chuển: " + d5.move());

        MoveablePoint d6 = new MoveablePoint(2f,2f,0.5f,0.5f);
        System.out.println("Đối tượng sau khi di chuển: " + d6.move());
    }
}
