package bai_6_Uoc_Boi;

import java.util.Scanner;

public class UCLN_BCNN {
    static int UCLN(int a, int b){
//        while (true){
//            if (a==b) return a;
//            else if (a>b) a = a-b;
//                else b = b-a;
//        }
        while (a!=b){
            if (a>b) a -= b;
            else b -= a;
        }return a;
    }
    static int BCNN(int a, int b){
        int max = Math.max(a,b);
        for (int i = max; i <= a*b; i++) {
            if (i%a == 0 && i%b==0) {
                return i;
            }
        }
        return -1;
    }
    //- Cho 2 số nguyên dương a và b. Hãy tìm ước chung lớn nhất của 2 số này.
    //- Cho 2 số nguyên dương a và b. Hãy tìm bội chung nhỏ nhất của 2 số này
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("Mời nhập số b: ");
        int b = scanner.nextInt();
        System.out.println("UCLN: "+UCLN(a,b));
        System.out.println("BCNN: "+BCNN(a,b));
    }
}
