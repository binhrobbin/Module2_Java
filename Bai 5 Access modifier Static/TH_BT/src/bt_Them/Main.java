package bt_Them;

public class Main {
    public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(4);
    Circle c3 = new Circle(5);

        System.out.print("Circle: "+c1);
        System.out.print(c2);
        System.out.println(c3);
        System.out.println("số lượng đối tượng được tạo từ lớp Circle là: "+Circle.displayAmount());
        System.out.println("Chu vi của đối tựơng c1 là: "+c1.getPerimeter());
        System.out.println("Diện tích của đối tựơng c1 là: "+c1.getArea());
        System.out.println("Diện tích của đối tựơng c2 là: "+c2.getArea());
        System.out.println("Diện tích của đối tựơng c3 là: "+c3.getArea());
        System.out.println("hình tròn có bán kính lớn nhất là: "+Circle.maxRadius);
        System.out.println("tổng diện tích các hình tròn được tạo ra từ lớp Circle là: "+Circle.getSumArea());
    }
}
