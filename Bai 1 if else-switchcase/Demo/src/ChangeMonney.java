import java.util.Scanner;

public class ChangeMonney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng USD: ");
        double usd = scanner.nextDouble();
        double vnd = usd*23000;
        System.out.println("So tiền VND sau khi chuyển đổi là: "+vnd);
    }
}
