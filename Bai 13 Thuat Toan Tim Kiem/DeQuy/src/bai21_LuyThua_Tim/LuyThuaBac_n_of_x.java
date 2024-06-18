package bai21_LuyThua_Tim;

import java.util.Scanner;

//Viết hàm đệ quy tính lũy thừa bậc n của một số nguyên x.
public class LuyThuaBac_n_of_x {

    static int aaa(int n, int x){
        if (n>1) return x * aaa(n-1,x);
        return x;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        System.out.println("Nhập x");
        int x = scanner.nextInt();
        System.out.println(aaa(n,x));
    }
}
