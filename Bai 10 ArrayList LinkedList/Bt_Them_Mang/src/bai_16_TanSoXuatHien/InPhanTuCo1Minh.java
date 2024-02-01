package bai_16_TanSoXuatHien;

import java.util.ArrayList;

public class InPhanTuCo1Minh {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random =(int) (Math.random()*5);
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: "+arrayList);
        int count;
        int dem =0;
        System.out.println("Các phần tử xuất hiện 1 lần là: ");
        for (int i = 0; i < arrayList.size(); i++) {
            count =1;
            for (int j = i+1; j < arrayList.size(); j++) {
                if (arrayList.get(i) == arrayList.get(j)) {
                    count++;
                    arrayList.remove(j);
                    j--;
                }
            }
            if (count ==1) {
                System.out.println(arrayList.get(i));
                dem++;
            }
        }
        if (dem == 0) System.out.println("KO có phần tử nào");
    }
}
