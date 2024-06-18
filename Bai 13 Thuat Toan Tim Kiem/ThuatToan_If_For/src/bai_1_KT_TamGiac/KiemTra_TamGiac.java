package bai_1_KT_TamGiac;

import java.util.Scanner;

public class KiemTra_TamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chieu dài 3 cạnh của tam giác");
        System.out.println("Cạnh a: ");
        int a = scanner.nextInt();
        System.out.println("Cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("Cạnh c: ");
        int c = scanner.nextInt();
        if (a+b>c && b+c>a && a+c>b){
            if ((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == b*b + a*a))
                System.out.println("Là tam giác vuông");
            else if (a==b && a==c)
                System.out.println("Là tam giác đều");
            else if (a==b || b==c || c==a)
                System.out.println("Là tam giác cân");
            else if ((a*a > b*b + c*c) || (b*b > a*a + c*c) || (c*c > b*b + a*a))
                System.out.println("Là tam giac tù");
                else System.out.println("là tam giác nhọn");
        }
        else System.out.println("Không phải tam giác");
    }
}
