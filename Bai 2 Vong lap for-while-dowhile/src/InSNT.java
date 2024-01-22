import java.util.Scanner;

public class InSNT {
    public static void main(String[] args) {
        System.out.println("Mời bạn nhập vào số lượng snt cần in: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>0) {
            byte dem;
            int n = 2;
            byte count = 0;
            while (count<a) {
                dem =0;
                for (byte i=1; i <= (Math.sqrt(n)); i++) {
                    if (n % i == 0) {
                        dem++;
                    }
                }
                if (dem == 1) {
                    System.out.println(n);
                    count++;
                }
                n++;
            }
        }
    }
}
