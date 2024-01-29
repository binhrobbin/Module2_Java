package bt1_Resize;

import java.util.Random;

public class TestResize {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(2.0);
        resizeables[1] = new Rectangle(2.0,3.5);
        resizeables[2] = new Square(2.0);
        System.out.println("Trước khi tăng kích thước là");
        for (Resizeable resizeable:resizeables){
            System.out.println(resizeable);
            System.out.print(" Có diện tích là: ");
            if (resizeable instanceof Circle){
                Circle circle = (Circle) resizeable;
                System.out.println(circle.getArea());
            }else if (resizeable instanceof Rectangle){
                Rectangle rectangle = (Rectangle) resizeable;
                System.out.println(rectangle.getArea());
            }else {
                Square square = (Square) resizeable;
                System.out.println(square.getArea());
            }
        }
        System.out.println("----------------------------");
        double random = Math.random();
        random = random *100+1;
        System.out.println("Sau khi tăng kích thước "+random+"% là");
        for (Resizeable resizeable:resizeables){
            if (resizeable instanceof Circle){
                Circle circle = (Circle) resizeable;
                circle.resize(random);
                System.out.println(resizeable);
                System.out.print(" Có diện tích là: ");
                System.out.println(circle.getArea());
            }else if (resizeable instanceof Rectangle){
                Rectangle rectangle = (Rectangle) resizeable;
                rectangle.resize(random);
                System.out.println(resizeable);
                System.out.print(" Có diện tích là: ");
                System.out.println(rectangle.getArea());
            }else {
                Square square = (Square) resizeable;
                square.resize(random);
                System.out.println(resizeable);
                System.out.print(" Có diện tích là: ");
                System.out.println(square.getArea());
            }
        }
    }
}
