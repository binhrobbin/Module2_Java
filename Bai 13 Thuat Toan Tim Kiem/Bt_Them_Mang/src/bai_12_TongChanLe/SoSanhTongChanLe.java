package bai_12_TongChanLe;

import java.util.ArrayList;

public class SoSanhTongChanLe {
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
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2 == 0){
                sumEven += arrayList.get(i);
            }else sumOdd += arrayList.get(i);
        }
        System.out.print("\nTổng các phần tử chẵn: "+sumEven);
        System.out.println("\nTổng các phần tử lẻ: "+sumOdd);
        if (sumEven>sumOdd) System.out.println("Tổng chẵn lớn hơn tổng lẻ");
        else if (sumEven == sumOdd) System.out.println("Tổng chẵn bằng tổng lẻ");
            else System.out.println("Tổng chẵn nhỏ hơn tổng lẻ");
    }
}