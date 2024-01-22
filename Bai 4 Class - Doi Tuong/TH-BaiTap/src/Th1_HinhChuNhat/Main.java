package Th1_HinhChuNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        double rong = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều cao: ");
        double cao = Double.parseDouble(scanner.nextLine());
        Rectangle hcn = new Rectangle(rong,cao);
        System.out.println("HCN của bạn là \n"+hcn.display());
        System.out.println("Diện tích là "+hcn.getArea());
        System.out.println("chu vi cao là "+hcn.getPerimeter());
    }
}