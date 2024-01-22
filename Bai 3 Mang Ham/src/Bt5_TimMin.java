import java.util.Arrays;
import java.util.Scanner;

public class Bt5_TimMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte size;
        do {
            System.out.println("Mời bạn nhập số lượng phần tử của mảng <30");
            size = input.nextByte();
            if (size>30) System.out.println("Bạn nhập quá giới hạn phẩn tử 30");
        }
        while (size>30);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Mời bạn nhập phần tử thứ "+(i+1)+" của mảng arr");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng arr sau khi nhập là "+ Arrays.toString(arr));
        System.out.println("Min của mảng arr sau là "+ timMin(arr));
    }
    public static int timMin(int[] arr){
        int min = arr[0];
        for (int x:arr){
            if (min >x) min =x;
        }
        return min;
    }
}
