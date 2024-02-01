package bai_18_Tim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class K_PhanTuLonNhat {

    //Tìm k phần tử lớn nhất trong một mảng
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 20-10);
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: " + arrayList);
        System.out.println("Nhập số lượng k phần tử muốn tìm lớn nhất: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        System.out.println("Mảng sau khi sắp xếp là: " + arrayList);
        System.out.print(k+" phần tử cần tìm là: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arrayList.get(i)+"  ");
        }
    }
}
