package bai_4_TongBinhPhuong;

import java.util.Scanner;

public class TongChanTuA_B {
    static Scanner scanner = new Scanner(System.in);
    static int inSo(int a, int b){
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i%2==0) sum+=i;
            }
        return sum;
        }


    public static void main(String[] args) {
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Tổng các số chẵn từ a đến b là: ");
        System.out.println( inSo(a,b));
    }
}