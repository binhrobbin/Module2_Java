import java.util.Scanner;

public class SNTSmaller100 {
    public static void main(String[] args) {
            byte dem;
            int n = 2;
            while (n<100) {
                dem =0;
                for (byte i=1; i <= (Math.sqrt(n)); i++) {
                    if (n % i == 0) {
                        dem++;
                    }
                }
                if (dem == 1) {
                    System.out.println(n);
                }
                n++;
            }
    }
}
