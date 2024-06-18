package bai_7_ReadNumber;

import java.util.Scanner;

public class DocSo3ChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nguyên từ 0->999");
        int n = scanner.nextInt();
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] arr2 = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] arr3 = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        int a = n/100;
        int a2 = n%100;
        int c = a2/10;
        int c2 = a2%10;
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
            // All khác 0
        } else if (n>=100 && n<1000) {
            if (a2 !=0 && c2!=0 && c!=0) {
                for (int i = 0; i < 10; i++) {
                    if (i == a) {
                        for (int j = 0; j < 10; j++) {
                            if (j == c) {
                                for (int k = 0; k < 10; k++) {
                                    if (k == c2) {
                                        read = arr[i] + " hundred " + arr3[j] + "-" + arr[k];
                                        System.out.println(read);
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
            }else {
                // Hàng chục khác 0
                if (a2 != 0 && c2 ==0) {
                    for (int i = 0; i < 10; i++) {
                        if (i == a) {
                            for (int j = 0; j < 10; j++) {
                                if (j == c) System.out.println(arr[i] + " hundred " + arr3[j]);
                            }
                        }
                    }
                //Hàng chục bằng 0
                } else {
                    if (c2 == 0) {
                        for (int i = 0; i < 10; i++) {
                            if (i == a) System.out.println(arr[i] + " hundred ");
                        }
                    } else {
                        for (int i = 0; i < 10; i++) {
                            if (i == a) {
                                for (int j = 0; j < 10; j++) {
                                    if (j == c2) System.out.println(arr[i] + " hundred and " + arr[j]);
                                }
                            }
                        }
                    }
                }
            }
        }else System.out.println(" Nhập sai");
    }
}
