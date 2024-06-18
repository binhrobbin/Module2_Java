package bai20_GiaiThua_UCLN;

import java.util.Scanner;

//Viết hàm đệ quy tính tổng các số từ 1 đến n.
public class Tong1_n {
    static void deQuy(int i, int sum, int n){
        System.out.println(i);
        if (i < n+1) {
            sum += i;
            System.out.println("sum là: "+sum);
            deQuy(i+1,sum,n);
        } else System.out.println("kết quả là: "+sum);
    }

    static int deQuy2(int n){
        if (n>0) {
            return n+ deQuy2(n-1);
        } return 0;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        deQuy(1,0,n);
        System.out.println("kết quả 2 là: "+deQuy2(n));
    }
}
