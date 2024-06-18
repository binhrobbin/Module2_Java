package bai22_Chuoi_TinhS;

import java.util.Scanner;

public class TinhS {

    //Nhập vào n. Tính
    //S = 100 +1/3 + 1/2 + 3/5 + … + n*(n + 1)/ (n+1)*(n + 2);
    static double i=0;
    static double deQuy(double n){
        if (i<n){
            i++;
           return (i * (i + 1)) /((i+1)*(i+2)) + deQuy(n);
        }
        return 100;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        System.out.println("Tổng các số của biểu thức là: ");
        System.out.println(deQuy(n));
    }
}
