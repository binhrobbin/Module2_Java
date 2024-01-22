import java.util.Scanner;

public class Bt7_DuongCheo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Mời bạn nhập số lượng hàng/cột của ma trận vuông: ");
    short n = input.nextShort();
    int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Mời bạn nhập phần tử x= " + i + " y= " + j + " của ma trận: ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix sau khi nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Dòng " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        // Tổng 2 đường chéo
        int sum =0;
        for (int i = 0,k=n-1; i < n; i++,k--) {
            sum += matrix[i][i] +  matrix[k][i];
        }
        System.out.println("Tổng 2 đường chéo là: "+ sum);
    }
}

