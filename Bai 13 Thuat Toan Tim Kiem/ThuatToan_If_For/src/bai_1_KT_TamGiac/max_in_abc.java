package bai_1_KT_TamGiac;

public class max_in_abc {
    public static void main(String[] args) {
        int a = 2, b = 5, c = 4, max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        System.out.println(max);
    }
}
