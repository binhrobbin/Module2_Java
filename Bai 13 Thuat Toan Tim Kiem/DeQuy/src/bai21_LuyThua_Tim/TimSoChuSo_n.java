package bai21_LuyThua_Tim;

import java.util.Scanner;

//Viết hàm đệ quy tìm số chữ số của một số nguyên dương n.
public class TimSoChuSo_n {

    static int deQuy(int n, int i, int count){
        if (n/i !=0) return deQuy(n,i*10,count+1);
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        System.out.println(deQuy(n,1,0));
    }
}
