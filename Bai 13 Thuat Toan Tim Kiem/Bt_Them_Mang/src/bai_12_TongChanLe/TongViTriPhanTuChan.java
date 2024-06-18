package bai_12_TongChanLe;

import java.util.ArrayList;

public class TongViTriPhanTuChan {
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
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2 == 0){
                sum += i;
            }
        }
        System.out.print("\nTổng VỊ TRÍ của các phần tử chẵn: "+sum);
    }
}