package bai_19;

import java.util.ArrayList;

public class SapXepChanTruocLe {
    //Sắp xếp một mảng chứa các số nguyên sao cho các số chẵn đứng trước các số lẻ.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayChange = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 20-10);
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: \n" + arrayList);
        for (int i = arrayList.size()-1; i >= 0 ; i--) {
            if (arrayList.get(i) %2 == 0) {
                arrayChange.add(0,arrayList.get(i));
            }else arrayChange.add(arrayList.get(i));
        }
        System.out.println("Mảng sau khi sắp xếp là: \n"+arrayChange);
    }
}
