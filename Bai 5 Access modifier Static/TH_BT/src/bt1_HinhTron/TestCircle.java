package bt1_HinhTron;

public class TestCircle {
    public static void main(String[] args) {
        Circle t1 = new Circle();
        Circle t2 = new Circle(3);

        System.out.println(t1.getArea());
        System.out.println(t1.getRadius());
        System.out.println(t2.getArea());
        System.out.println(t2.getRadius());

    }
}
