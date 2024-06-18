package bai_3_soChinhPhuong;

import java.util.Scanner;

public class Fizz_Buzz {
    static Scanner scanner = new Scanner(System.in);
    static void inSo(int a, int b){
        for (int i = a; i <= b; i++) {
            if (i%3 ==0 && i%5==0) System.out.println(i+": FizzBuzz ");
            else if (i%3 ==0) System.out.println(i+": Fizz ");
            else if (i%5 ==0) System.out.println(i+": Buzz ");
            else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Số cần in là: ");
        inSo(a,b);
    }
}

