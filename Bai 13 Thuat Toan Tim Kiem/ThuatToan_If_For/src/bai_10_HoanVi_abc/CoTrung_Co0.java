package bai_10_HoanVi_abc;

import java.util.Scanner;

public class CoTrung_Co0 {

    //Nhập a,b,c (có thể trùng, có thể bằng 0). In ra các số 3 chữ số có thể tạo ra từ a,b,c
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        int a = scanner.nextInt();
        System.out.println("Nhập b:");
        int b = scanner.nextInt();
        System.out.println("Nhập c:");
        int c = scanner.nextInt();
        int[] arr;
        if (a==b && a==c) {
            arr = new int[]{a};
        }else if (a==b) {
            arr = new int[]{a,c};
        }else if (a==c || b==c) {
            arr = new int[]{a,b};
        } else arr = new int[]{a,b,c};

        System.out.println(" Các phương án có thể xảy ra là: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                        System.out.print(arr[i]+""+arr[j]+arr[k]+"; ");
                }
            }
        }
    }
}
