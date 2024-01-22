import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte size;
        do {
            System.out.println("Mời bạn nhập số phần tử của mảng:");
            size = input.nextByte();
            if (size>20) System.out.println("Bạn nhập mảng quá lớn >20");
        }
        while (size>20);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Nhập phần tử thứ:"+(i+1));
            arr[i] = input.nextInt();
        }
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
            System.out.print(arr[i]);
        }

        System.out.println(" Số lớn nhất của mảng là: "+max);
    }
}
