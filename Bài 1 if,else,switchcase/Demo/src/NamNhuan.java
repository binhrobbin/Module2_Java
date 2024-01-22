import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        System.out.println("Mời bạn nhập năm cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year%4 ==0 && year %100 !=0 || year%400 ==0){
            System.out.println(year+" là năm nhuận");
        }else System.out.println(year+" KO là năm nhuận");
    }
}
