package bai_6_Uoc_Boi;

import java.util.Scanner;

public class LietKe {
    static void uocNguyenDuong(int a){
        for (int i = 1; i <= a; i++) {
            if (a%i == 0) {
                System.out.print(i+"; ");
            }
        }
    }
    static void boiNhoHon100(int a){
        for (int i = a; i < 100; i++) {
            if (i%a == 0) System.out.print(i+"; ");
        }
    }
    //Liệt kê các ước số nguyên dương của a
    //Liệt kê các bội số nhỏ hơn 100 của a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số a: ");
        int  a = scanner.nextInt();
        System.out.println("ƯỚc số nguyên dương của a là Ư(a)=");
        uocNguyenDuong(a);
        System.out.println("\nBội số nhỏ hơn 100 của a là: ");
        boiNhoHon100(a);
    }
}
