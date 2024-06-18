package bai_12_TongChanLe;

import java.util.ArrayList;

public class TongViTriLe {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * 10 - 5);
            arrayList.add(random);
        }
        System.out.print("Mảng ban đầu là: ");
        for (int list : arrayList) {
            System.out.print(list + ", ");
        }
        int sum = 0;
        for (int i = 1; i < arrayList.size(); i++, i++) {
            sum += arrayList.get(i);
        }
        System.out.print("\n tổng các phần tử nằm ở vị trí lẻ: "+sum);
    }
}