package bai_2_LaiNganHang;

import java.util.Scanner;

public class LaiNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền cho vay (USD): ");
        double money = scanner.nextInt();
        System.out.println("Nhập tháng cho vay ");
        int month = scanner.nextInt();
        System.out.println("Nhập lãi suất/ năm: ");
        double interestRate = scanner.nextInt();
        double totalLai = money* (interestRate/100)/12*month;
        System.out.println("Tổng lãi nhận được là: "+totalLai);
    }
}
