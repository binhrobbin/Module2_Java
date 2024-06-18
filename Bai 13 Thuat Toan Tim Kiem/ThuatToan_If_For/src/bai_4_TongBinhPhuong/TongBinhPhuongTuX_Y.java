package bai_4_TongBinhPhuong;

import java.util.Scanner;

public class TongBinhPhuongTuX_Y {
    static Scanner scanner = new Scanner(System.in);
    static int inSo(int a, int b){
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum+=i*i;
            }
        return sum;
        }


    public static void main(String[] args) {
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập y: ");
        int y = scanner.nextInt();
        System.out.println("Tổng các số bình phương từ x đến y là: ");
        System.out.println( inSo(x,y));
    }
}