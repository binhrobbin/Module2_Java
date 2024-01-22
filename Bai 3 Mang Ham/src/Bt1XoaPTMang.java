import java.util.Arrays;
import java.util.Scanner;

public class Bt1XoaPTMang {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Mảng ban đầu là ");
        for (int x:arr){
            System.out.print(x);
        }
        Scanner input = new Scanner(System.in);
        System.out.println(" Mời nhập vị trí phần tử cần xóa: ");
        byte a = input.nextByte();
        int[] newArr2 = new int[5];
        for (int i = 0; i < newArr2.length; i++) {
            if (i<a) newArr2[i] = arr[i];
            else newArr2[i] = arr[i+1];
        }
        arr = newArr2;
        System.out.println(Arrays.toString(arr));
    }
}
