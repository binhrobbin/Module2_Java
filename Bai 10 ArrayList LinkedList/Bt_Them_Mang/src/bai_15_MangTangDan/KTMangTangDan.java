package bai_15_MangTangDan;

import java.util.ArrayList;

public class KTMangTangDan {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int random =(int) (Math.random()*10-5);
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: "+arrayList);
        int count = 0;
        for (int i = 0; i < 5-1; i++) {
            if (arrayList.get(i) >= arrayList.get(i+1)) count++;
        }
        if (count==0) System.out.println("Mảng là tăng dần");
        else System.out.println("Mảng KO tăng dần");
    }
}
