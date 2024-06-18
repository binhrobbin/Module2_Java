package bai_2_LaiNganHang;

import java.util.Scanner;

public class PhanLoaiHocSinh {
    static void phanLoai (double score){
        if (score<=10 && score>=0) {
            if (score >= 8.5) System.out.println("Loại giỏi");
            else if (score >= 7) System.out.println("Loại khá");
            else if (score >= 5.5) System.out.println("Loại trung bình");
            else if (score >= 4) System.out.println("Loại yếu");
            else System.out.println("Loại kém");
        }else System.out.println("Bạn nhập sai");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm học sinh");
        double score = scanner.nextDouble();
        phanLoai(score);
    }
}
