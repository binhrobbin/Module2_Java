package bai20_GiaiThua_UCLN;

import java.util.Scanner;

//Viết hàm đệ quy tính giai thừa của một số nguyên dương n.
public class GiaiThua {
    static int giaiThua(int n){
        if (n>0) {
            return n* giaiThua(n-1);
        } return 1;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();

        System.out.println(  giaiThua(n));
    }
}
