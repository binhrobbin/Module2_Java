import java.util.Scanner;

public class Bt6_SumColummX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng hàng của mảng 2D");
        byte x = input.nextByte();
        System.out.println("Mời bạn nhập số lượng cột của mảng 2D");
        byte y = input.nextByte();
        System.out.println("Mời bạn nhập số cột muốn tính tổng n:  1->"+(y));
        byte n = input.nextByte();
        int sum = 0;
        int[][] arr2D = new int[x][y];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.println("Mời bạn nhập phần tử x= "+i+" y= "+j+" của mảng arr2D: ");
                arr2D[i][j] = input.nextInt();
            }
            sum += arr2D[i][n-1];
        }
        System.out.println("Mảng sau khi nhập là: ");
        for (int i = 0; i < arr2D.length; i++) {
            System.out.print("Dòng " + (i + 1) + ": ");
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Tổng của cột n="+n+" là: "+sum);
    }
}
