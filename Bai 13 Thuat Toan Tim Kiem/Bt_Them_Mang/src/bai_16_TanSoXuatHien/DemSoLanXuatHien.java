package bai_16_TanSoXuatHien;

import java.util.ArrayList;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random =(int) (Math.random()*10);
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: "+arrayList);
        int count;
        for (int i = 0; i < arrayList.size(); i++) {
            count =1;
            for (int j = i+1; j < arrayList.size(); j++) {
                if (arrayList.get(i) == arrayList.get(j)) {
                    count++;
                    arrayList.remove(j);
                    j--;
                }
            }
            System.out.println("Phan tử "+arrayList.get(i)+ " xuất hiện: "+count+" lần trong Mảng");
        }
    }
}
