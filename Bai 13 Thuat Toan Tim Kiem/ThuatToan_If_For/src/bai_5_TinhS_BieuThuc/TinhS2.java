package bai_5_TinhS_BieuThuc;

import java.util.Scanner;

public class TinhS2 {
    static double sumS(int n){
        double sum = 0;
        for (int i =0 ; i <= n; i++) {
            sum+= (double) (2 * i + 1) /(2*i+2);
        }
        return sum;
    }

// Nhập vào n. Tính S = ½ + ¾ + 5/6 + … + 2n + 1/ 2n + 2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        System.out.println("Tổng các số của biểu thức là: ");
        System.out.println( sumS(n));
    }
}