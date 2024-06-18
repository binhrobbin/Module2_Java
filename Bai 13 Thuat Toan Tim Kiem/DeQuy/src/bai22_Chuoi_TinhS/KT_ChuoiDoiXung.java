package bai22_Chuoi_TinhS;

import java.util.Scanner;

public class KT_ChuoiDoiXung {

    //Kiểm tra chuỗi đối xứng

    static String deQuy(String chuoi, int i, int j){

       if (chuoi.charAt(i) == chuoi.charAt(j) && i<=j) return deQuy(chuoi, i+1, j-1);
       if (i == chuoi.length()/2) return "là chuỗi đối xứng";
        else return "Không phải";
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập chuoi");
        String chuoi = scanner.nextLine();
        int j = chuoi.length()-1;
        System.out.println( deQuy(chuoi,0,j));

//        for (int i = 0; i < chuoi.length(); i++) {
//            System.out.println(chuoi.charAt(i);
//        }
    }
}
