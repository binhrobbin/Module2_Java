package bai_18_Tim;

import java.util.ArrayList;
import java.util.Scanner;

public class DayConLienTiepMaxSum {

    //Tìm dãy con liên tiếp có tổng lớn nhất trong một mảng.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayChild = new ArrayList<>();
        ArrayList<Integer> arraySumMax = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 10);
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: " + arrayList);
        System.out.println("Nhập số lượng phần tử con muốn so sánh (1<=n<20): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum;
        int sumMax =0;
        if (n>=1 && n<arrayList.size()) {
            for (int i = 0; i < arrayList.size() - n; i++) {
                sum = 0;
                arrayChild.clear();
                for (int j = i; j < (i + n); j++) {
                    sum += arrayList.get(j);
                    arrayChild.add(arrayList.get(j));
                }
                if (sum > sumMax) {
                    sumMax = sum;
                    arraySumMax.clear();
                    for (Integer arr : arrayChild) {
                        arraySumMax.add(arr);
                    }
                }
            }
            System.out.println("Mảng con liên tiếp '"+n+"' phần tử có tổng '"+sumMax+"' lớn nhất bạn cần tìm là:\n"+arraySumMax);
        }else System.out.println("Bạn nhập sai cú pháp");
    }
}
