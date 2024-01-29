import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời chiều rộng của hcn: ");
        width = scanner.nextFloat() ;
        System.out.println("Mời chiều cao của hcn: ");
        height = scanner.nextFloat();
        float area = width*height;
        float chuvi = (width+height)*2;
        System.out.println("diện tích hcn là: "+area);
        System.out.println("Chu vi hcn là: "+chuvi);
    }
}
