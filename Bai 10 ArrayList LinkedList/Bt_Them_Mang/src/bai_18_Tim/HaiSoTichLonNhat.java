package bai_18_Tim;

import java.util.ArrayList;
import java.util.Collections;

public class HaiSoTichLonNhat {

    // Tìm hai số trong một mảng có tích lớn nhất
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 20-10);
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Mảng sau khi sắp xếp là: " + arrayList);
        int multiMaxHead = arrayList.get(0)*arrayList.get(1);
        int multiMaxTail = arrayList.get(arrayList.size()-1)*arrayList.get(arrayList.size()-2);
        if (multiMaxTail>multiMaxHead) System.out.println("Số tích lớn nhất cần tìm là: "+multiMaxTail);
        else System.out.println("Số tích lớn nhất cần tìm là: "+multiMaxHead);
    }
}
