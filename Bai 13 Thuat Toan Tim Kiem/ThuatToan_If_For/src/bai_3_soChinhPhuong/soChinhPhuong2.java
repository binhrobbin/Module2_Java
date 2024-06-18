package bai_3_soChinhPhuong;

import java.util.Scanner;

public class soChinhPhuong2 {
    static Scanner scanner = new Scanner(System.in);
    static void inSo(int a, int b){
        for (int i = a; i <= b; i++) {
            for (int j = 0; j <= Math.sqrt(i); j++) {
//                if (j * j == i){
                if (j == Math.sqrt(i)){
                    System.out.print( i + ", ");
                }
            }
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
