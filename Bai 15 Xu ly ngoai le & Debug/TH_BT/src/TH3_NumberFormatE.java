import java.util.Scanner;

public class TH3_NumberFormatE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        TH3_NumberFormatE calc = new TH3_NumberFormatE();
        try {
            calc.calculate(x, y);
        } catch (ArithmeticException e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }

    }

//    private void calculate(int x, int y) {
    private void calculate(int x, int y) throws ArithmeticException {
//        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        throw new  ArithmeticException ();
//        } catch (ArithmeticException e) {
//            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
//        }
    }
}
