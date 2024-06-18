package bai_7_ReadNumber;

import java.util.Scanner;

public class DocSo2ChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nguyên từ 0->99");
        int n = scanner.nextInt();
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] arr2 = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] arr3 = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        int b = n/10;
        int b2 = n%10;
        String read = "";
        if (n>=0 && n<10){
            for (int i = 0; i < 10; i++) {
                if (i == n) System.out.println(arr[i]);
            }
        } else if (n>=10 && n<20) {
            for (int i = 0; i < 10; i++) {
                if (i == b2) System.out.println(arr2[i]);
            }
        } else if (n>=20 && n<100) {
            if (b2!=0) {
                for (int i = 0; i < 10; i++) {
                    if (i == b) {
                        for (int j = 0; j < 10; j++) {
                            if (j == b2) {
                                read = arr3[i] + "-" + arr[j];
                                System.out.println(read);
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            // Hàng chục bằng 0
            else {
                for (int i = 0; i < 10; i++) {
                    if (i == b) System.out.println(arr3[i]);
                }
            }
        } else  System.out.println(" Nhập sai");
    }
}
