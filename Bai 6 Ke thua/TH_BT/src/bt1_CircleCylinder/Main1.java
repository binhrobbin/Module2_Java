package bt1_CircleCylinder;

public class Main1 {
    public static void main(String[] args) {
        Circle1 circle = new Circle1();
        System.out.println("Circle: "+circle);
        Circle1 circle1 = new Circle1(3.0,"red");
        System.out.println("Circle: "+circle1);
        System.out.println("Diện tích hình tròn là: "+ circle1.getArea());

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(3.5);
        System.out.println(cylinder1);
        Cylinder cylinder2 = new Cylinder(3.2,"black",2.5);
        System.out.println(cylinder2);
        System.out.println("Diện tích hình thoi là: "+ cylinder2.getVolume());
    }
}
