package bai_3_soChinhPhuong;

import java.util.Scanner;

public class soChinhPhuong {
    static Scanner scanner = new Scanner(System.in);
    static void inSo(int a, int b){
        for (double i = a; i <= b; i++) {
            if (Math.ceil(Math.sqrt(i)) == Math.floor(Math.sqrt(i)))
                System.out.print((int) i + ", ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Số chính phương từ a đến b là: ");
        inSo(a,b);
    }
}
