package bai_13_max;

import java.util.ArrayList;
import java.util.Collections;

public class TimMax {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random =(int) (Math.random()*30-15);
            arrayList.add(random);
        }
        System.out.print("Mảng ban đầu là: ");
        for (int list:arrayList){
            System.out.print(list+", ");
        }
        System.out.print("\nMảng sau sắp xếp là: ");
        Collections.sort(arrayList);
        for (int list : arrayList){
            System.out.print(list+", ");
        }
        System.out.print("\nMax là: "+arrayList.get(arrayList.size()-1));
    }
}
