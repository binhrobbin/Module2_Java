package bai_5_TinhS_BieuThuc;

import java.util.Scanner;

public class TinhS3 {
    static double sumS(int n){
        double sum = 100;
        for (int i =0 ; i <= n; i++) {
            sum+= (double) (i * (i + 1)) /((i+1)*(i+2));
        }
        return sum;
    }

// Nhập vào n. Tính
//S = 100 +1/3 + 1/2 + 3/5 + … + n*(n + 1)/ (n+1)*(n + 2);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        System.out.println("Tổng các số của biểu thức là: ");
        System.out.println( sumS(n));
    }
}