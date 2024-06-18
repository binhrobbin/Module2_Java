package bai_7_ReadNumber;

import java.util.Scanner;

public class DocSo1ChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nguyên từ 0->9");
        int n = scanner.nextInt();
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < 10; i++) {
            if (i == n) System.out.println(arr[i]);
        }
    }
}
