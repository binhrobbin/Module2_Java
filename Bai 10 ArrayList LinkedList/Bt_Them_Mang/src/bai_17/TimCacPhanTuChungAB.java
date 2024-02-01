package bai_17;

import java.util.ArrayList;

public class TimCacPhanTuChungAB {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListA = new ArrayList<>();
        ArrayList<Integer> arrayListB = new ArrayList<>();
        ArrayList<Integer> arrayListC = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 10);
            arrayListA.add(random);
        }
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 10);
            arrayListB.add(random);
        }
        System.out.println("Mảng A ban đầu là: "+arrayListA);
        System.out.println("Mảng B ban đầu là: "+arrayListB);
        for (int i = 0; i < arrayListA.size(); i++) {
            if (arrayListB.contains(arrayListA.get(i)))
                arrayListC.add(arrayListA.get(i));
        }
        // lọc trùng
        for (int i = 0; i < arrayListC.size()-1; i++) {
            for (int j = i+1; j < arrayListC.size(); j++) {
                if (arrayListC.get(i) == arrayListC.get(j)) {
                    arrayListC.remove(j);
                    j--;
                }
            }
        }
        System.out.println("Các phần tử chung của AB là: "+arrayListC);
    }
}
