import java.util.InputMismatchException;
import java.util.Scanner;

public class Bt1_TriangleException {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập cạnh a: ");
        double a = input();
        System.out.println("Nhập cạnh b: ");
        double b = input();
        System.out.println("Nhập cạnh c: ");
        double c = input();
        if (a<(b+c) && b<(a+c)&& c<(a+b) && a*b*c>0) System.out.println("là tam giác");
        else System.out.println("ko là tam giác");
    }
    static double input(){
        try {
            double canh = scanner.nextDouble();
            return canh;
        }catch (InputMismatchException i){
            System.out.println("ssss");
            return 0;
        }
    }
}
