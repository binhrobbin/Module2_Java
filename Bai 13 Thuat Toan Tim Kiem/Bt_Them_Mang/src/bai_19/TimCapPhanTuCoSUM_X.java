package bai_19;

import java.util.ArrayList;
import java.util.Scanner;

public class TimCapPhanTuCoSUM_X {
    //Tìm tất cả các cặp phần tử trong một mảng có tổng bằng một giá trị cho trước
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            int random = (int) (Math.random() * 20-10);
            arrayList.add(random);
        }
        System.out.println("Mảng ban đầu là: " + arrayList);
        System.out.println("Nhập giá trị tổng X ban đầu của cặp: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Các cặp cần tìm là: ");
        for (int i = 0; i < arrayList.size()-1; i++) {
            for (int j = i+1; j < arrayList.size(); j++) {
                if ((arrayList.get(i)+arrayList.get(j)) == x){
                    System.out.println(arrayList.get(i)+" và "+arrayList.get(j));
                    // lọc trùng
                    for (int k = i+1; k < arrayList.size(); k++) {
                       if (arrayList.get(i) == arrayList.get(k)){
                           arrayList.remove(k);
                           k--;
                       }
                    }
                    arrayList.remove(i);
                    i--;
                    break;
                }
            }
        }
    }
}
