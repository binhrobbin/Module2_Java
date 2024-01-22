import java.util.Arrays;
import java.util.Scanner;

public class Bt3_Gop2Mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Tạo mảng A
        System.out.println("Mời nhập số lượng phần tử của mảng arrA: ");
        int nA = input.nextInt();
        int[] arrA = new int[nA];
        for (int i = 0; i < nA; i++) {
            System.out.println("Mời nhập phần tử thứ "+(i+1)+" trong arrA");
            arrA[i] = input.nextInt();
        }
        System.out.println("Mảng arrA sau khi nhập là: "+ Arrays.toString(arrA));

        //Tạo mảng B
        System.out.println("Mời nhập số lượng phần tử của mảng arrB: ");
        int nB = input.nextInt();
        int[] arrB = new int[nB];
        for (int i = 0; i < nB; i++) {
            System.out.println("Mời nhập phần tử thứ "+(i+1)+" trong arrB");
            arrB[i] = input.nextInt();
        }
        System.out.println("Mảng arrB sau khi nhập là: "+ Arrays.toString(arrB));

        //Tạo mảng C
        int[] arrC = new int[nA+nB];
        for (int i = 0; i < arrC.length; i++) {
            if (i<nA) arrC[i] = arrA[i];
            else arrC[i] = arrB[i-nA];
        }
        System.out.println("Mảng arrC sau khi gộp là: "+ Arrays.toString(arrC));
    }
    
}
