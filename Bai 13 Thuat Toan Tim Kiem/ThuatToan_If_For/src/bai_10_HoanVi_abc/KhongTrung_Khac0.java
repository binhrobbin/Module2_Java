package bai_10_HoanVi_abc;

import java.util.Scanner;

public class KhongTrung_Khac0 {

    //Nhập a,b,c (không trùng, khác 0). In ra các số 3 chữ số có thể tạo ra từ a,b,c
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        int a = scanner.nextInt();
        System.out.println("Nhập b:");
        int b = scanner.nextInt();
        System.out.println("Nhập c:");
        int c = scanner.nextInt();
        int[] arr = {a,b,c};
        System.out.println(" Các phương án có thể xảy ra là: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                        System.out.print(arr[i]+""+arr[j]+arr[k]+"; ");
                }
            }
        }
    }
}
