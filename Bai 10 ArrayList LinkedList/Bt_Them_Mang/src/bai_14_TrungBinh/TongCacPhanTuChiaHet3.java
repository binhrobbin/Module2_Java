package bai_14_TrungBinh;

import java.util.ArrayList;

public class TongCacPhanTuChiaHet3 {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int random =(int) (Math.random()*10-5);
            if (random%3==0){
                sum +=random;
            }
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: "+arrayList);
        System.out.println("Tổng các phần tử chia hết cho 3 là là: "+sum);
    }
}
