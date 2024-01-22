import java.util.Arrays;
import java.util.Scanner;

public class Bt2ThemPTMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        System.out.println("Mời nhập số cần chèn: ");
        byte a = input.nextByte();
        System.out.println("Mời nhập vị trí cần chèn: ");
        byte index = input.nextByte();
        int[] newArr3 = new int[7];
        newArr3[index] = a;
        for (int i = 0; i < arr.length; i++) {
            if (i < index) newArr3[i] = arr[i];
            else newArr3[i+1] = arr[i];
        }
        arr = newArr3;
        System.out.println(Arrays.toString(arr));
    }
}
