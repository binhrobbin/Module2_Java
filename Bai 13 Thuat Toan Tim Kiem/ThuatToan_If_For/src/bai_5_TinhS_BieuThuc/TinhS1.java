package bai_5_TinhS_BieuThuc;

import java.util.Scanner;

public class TinhS1 {
    static int sumS(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i*(i+1);
        }
        return sum;
    }

// Nhập vào n. Tính S = 1.2 + 2.3 + 3.4 + ... + n(n+1)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        System.out.println("Tổng các số của biểu thức là: ");
        System.out.println( sumS(n));
    }
}