import java.util.Scanner;

public class ReverseMang {
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
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Nhập phần tử thứ:"+(i+1));
            arr[i] = input.nextInt();
        }
        int[] arr2 = new int[size];
        for (int i = 0,j=arr.length-1; i < arr.length; i++,j--) {
            arr2[j] = arr[i];
        }
        arr = arr2;
        for (int x:arr){
            System.out.print(x);
        }
    }
}
