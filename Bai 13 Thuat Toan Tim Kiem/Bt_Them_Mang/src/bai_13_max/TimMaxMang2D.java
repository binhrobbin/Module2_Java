package bai_13_max;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TimMaxMang2D {
    public static void main(String[] args) {
        System.out.println("Mảng ban đầu là: ");
        int[][] array = new int[2][3];
        for (int i = 0; i < 2; i++) {
            System.out.println("\n");
            for (int j = 0; j < 3; j++) {
                int random =(int) (Math.random()*30-15);
                array[i][j]=random;
                System.out.print(array[i][j]+", ");
            }
        }
        int  max = array[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (max<array[i][j]) max = array[i][j];
            }
        }
        System.out.println("\n\nMax là: "+max);
    }
}
