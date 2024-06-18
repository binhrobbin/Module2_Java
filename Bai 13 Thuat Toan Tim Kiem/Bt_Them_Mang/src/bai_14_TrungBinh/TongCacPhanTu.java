package bai_14_TrungBinh;

import java.util.ArrayList;

public class TongCacPhanTu {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random =(int) (Math.random()*30-15);
            sum +=random;
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: "+arrayList);
        System.out.println("Tổng các phần tử là: "+sum);
    }
}
