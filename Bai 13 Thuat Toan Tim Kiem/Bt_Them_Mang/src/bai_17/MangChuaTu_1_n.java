package bai_17;

import java.util.ArrayList;
import java.util.Scanner;

public class MangChuaTu_1_n {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 5+1);
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: " + arrayList);

        //Kiểm tra xem một mảng có chứa tất cả các số từ 1 đến n không.
        System.out.println("Mời nhập số n cần kiểm ra: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
          if (arrayList.contains(i)){
              count++;
          }
        }
        if (count == n) System.out.println("Mảng ban đầu có chứa tất cả các số từ 1 đến "+n);
        else System.out.println("Mảng ban đầu KO CHỨA tất cả các số từ 1 đến "+n);
    }
}
