package bai_14_TrungBinh;

import java.util.ArrayList;

public class TrungBinhCacPhanTu {
    public static void main(String[] args) {
        double sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int random =(int) (Math.random()*10);
            sum +=random;
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: "+arrayList);
        System.out.println("Trung bình các phần tử là: "+sum/arrayList.size());
    }
}
