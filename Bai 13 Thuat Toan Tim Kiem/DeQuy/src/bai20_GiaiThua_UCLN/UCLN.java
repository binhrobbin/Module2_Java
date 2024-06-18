package bai20_GiaiThua_UCLN;

import java.util.Scanner;

//Viết hàm đệ quy tính giai thừa của một số nguyên dương n.
public class UCLN {
    static void ucln(int a, int b){
        if (a == b) System.out.println(a);
        else if (a>b) {
            ucln(a-b,b);
        } else {
            ucln(a,b-a);
        }
    }

    static int ucln2(int a, int b){
        if (a == b) return a;
        else if (a>b) {
           return ucln2(a-b,b);
        } else {
           return ucln2(a,b-a);
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập a");
        int a = scanner.nextInt();
        System.out.println("Nhập b");
        int b = scanner.nextInt();
//        ucln(a,b);
        System.out.println(ucln2(a,b));
    }
}
