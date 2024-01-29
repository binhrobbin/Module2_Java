package bt4_Shape_Triangle;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập màu sắc của tam giác: ");
        String color = scanner.nextLine();
        int a =0;
        Triangle t1;
        do {
            System.out.println("Mời bạn nhập cạnh thứ nhất: ");
            double side1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập cạnh thứ hai: ");
            double side2 = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập cạnh thứ ba: ");
            double side3 = Double.parseDouble(scanner.nextLine());
            t1 = new Triangle(color,side1,side2,side3);
            if (t1.isTriangle()){
                System.out.println("3 cạnh tam giác bạn nhập vào lần lượt là: "+side1+", "+side2+", "+side3);
                a++;
            }else System.out.println("Bạn nhập sai hình");
        }while (a == 0);
        System.out.println(t1);
    }
}
