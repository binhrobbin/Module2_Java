package bai_6_Uoc_Boi;

import java.util.Scanner;

public class LietKe2 {
    static void uocNguyen(int a){
        int max =0 ;
        for (int i = 1; i <= a; i++) {
//            if (a%i == 0) {
//                if (i%2 != 0){
//                    if (max<i) max = i;
//                }
//            }
            if (a % i == 0 && i % 2 != 0 && max < i) max = i;
        }
        System.out.print(max);
    }
    static void boiMin(int a){
        int i = a;
        while (true){
            if (i%a == 0 && i%2==0){
                System.out.print(i);
                break;
            }
            i++;
        }
    }
    //Tìm ước số nguyên lẻ lớn nhất của a
    //Liệt kê bội chẵn nhỏ nhất của a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số a: ");
        int  a = scanner.nextInt();
        System.out.println("ƯỚc số nguyên lẻ lớn nhất của a là :");
        uocNguyen(a);
        System.out.println("\nbội chẵn nhỏ nhất của a là: ");
        boiMin(a);
    }
}
