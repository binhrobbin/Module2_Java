package bai_11_In;

import java.util.ArrayList;

public class InPhanTuChan {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random =(int) (Math.random()*30);
            arrayList.add(random);
        }
        System.out.print("Mảng ban đầu là: ");
        for (int list:arrayList){
            System.out.print(list+", ");
        }
        System.out.print("\nMảng sau lọc là: ");
        for (int list : arrayList){
            if (list%2 ==0) {
                System.out.print(list+", ");
            }
        }
    }
}
