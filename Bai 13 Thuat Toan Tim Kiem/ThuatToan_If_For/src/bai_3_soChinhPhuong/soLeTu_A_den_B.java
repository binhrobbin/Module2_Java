package bai_3_soChinhPhuong;

import java.util.Scanner;

public class soLeTu_A_den_B {
    static Scanner scanner = new Scanner(System.in);
    static void inSo(int a, int b){
        for (int i = a; i <= b; i++) {
            if (i%2 !=0){
                System.out.print(i+", ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Số lẻ từ a đến b là: ");
        inSo(a,b);
    }
}
