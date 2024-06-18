package bai_1_KT_TamGiac;

import java.util.Scanner;

public class ChanLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số để kt: ");
        int n = scanner.nextInt();
        if (n%2 == 0) System.out.println(n+" là số chẵn");
        else System.out.println("Là số lẻ");
    }
}
