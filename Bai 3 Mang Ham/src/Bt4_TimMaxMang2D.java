import java.util.Arrays;
import java.util.Scanner;

public class Bt4_TimMaxMang2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời bạn nhập kích thước của ma trận số: ");
        short n = input.nextShort();
        int[][] arr2D = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Mời bạn nhập phần tử x= "+i+" y= "+j+" của ma trận arr2D: ");
                arr2D[i][j] = input.nextInt();
            }
        }
        System.out.println("Ma trận sau khi nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Dòng "+(i+1)+": ");
            for (int j = 0; j < n; j++) {
                System.out.print(arr2D[i][j]);
            }
            System.out.println(" ");
        }

        int max =arr2D[0][0];
        System.out.println("Tìm thấy max ở phần tử x= 0 y= 0 của ma trận arr2D là: "+max);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (max<arr2D[i][j]){
                    max = arr2D[i][j];
                    System.out.println("Tìm thấy max ở phần tử x= "+i+" y= "+j+" của ma trận arr2D là: "+max);
                }
            }
        }
        System.out.println("Max lớn nhất trong mảng arr2D là: "+max);
    }
}
