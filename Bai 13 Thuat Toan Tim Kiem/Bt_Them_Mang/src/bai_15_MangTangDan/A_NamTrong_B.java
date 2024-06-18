package bai_15_MangTangDan;

import java.util.ArrayList;

public class A_NamTrong_B {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListA = new ArrayList<>();
        ArrayList<Integer> arrayListB = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int random =(int) (Math.random()*3);
            arrayListA.add(random);
        }
        for (int i = 0; i < 5; i++) {
            int random =(int) (Math.random()*3);
            arrayListB.add(random);
        }
        System.out.println("Mảng A ban đầu là: "+arrayListA);
        System.out.println("Mảng B ban đầu là: "+arrayListB);
        int count = 0;
        int aCoTrongB = 0;
        for (int i = 0; i < arrayListA.size(); i++) {
            count = 0;
            for (int j = 0; j < arrayListB.size(); j++) {
                if (arrayListA.get(i) == arrayListB.get(j)){
                    count++;
                    break;
                }
            }
            if (count!=0) aCoTrongB++;
        }
        if (aCoTrongB == arrayListA.size()){
            System.out.println("Mảng A nằm trong B");
        }else System.out.println("Mảng A KO nằm trong B");
    }
}
