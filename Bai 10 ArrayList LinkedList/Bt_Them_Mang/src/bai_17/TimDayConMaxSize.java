package bai_17;

import java.util.ArrayList;

public class TimDayConMaxSize {

    // Tìm dãy con liên tiếp tăng dần dài nhất trong mảng
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayChild = new ArrayList<>();
        ArrayList<Integer> arrayMax = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 10);
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: " + arrayList);

        int count;
        for (int i = 0; i < arrayList.size()-1; i++) {
            if (arrayList.get(i) < arrayList.get(i+1)){
                arrayChild.clear();
                count = 1;
                arrayChild.add(arrayList.get(i));
                for (int j = i; j < arrayList.size()-1; j++) {
                    if (arrayList.get(j) < arrayList.get(j+1)){
                        count++;
                        arrayChild.add(arrayList.get(j+1));
                    }else {
                        if (arrayMax.size() < arrayChild.size()) {
                            arrayMax.clear();
                            for (Integer arr:arrayChild){
                                arrayMax.add(arr);
                            }
                        }
                        i += count;
                        break;
                    }
                }
            }
        }
        System.out.println("Dãy con lớn nhất đầu tiên là: "+arrayMax);
    }
}
