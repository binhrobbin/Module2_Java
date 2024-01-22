import java.util.Arrays;
import java.util.Scanner;

public class Th_StudentPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte size;
        do {
            System.out.println("Mời bạn nhập số lượng học sinh cần nhập <30");
            size = input.nextByte();
            if (size>30) System.out.println("Bạn nhập quá giới hạn 30 học sinh");
        }
        while (size>30);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Mời bạn nhập điểm của hs thứ "+(i+1));
            arr[i] = input.nextInt();
        }
        System.out.println("Danh sách điểm vừa nhập là "+ Arrays.toString(arr));

        byte count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>= 5 && arr[i]<= 10) {
                count++;
                System.out.print("\n Sinh viên thứ "+ (i+1)+ " đã pass kỳ thi với điểm là "+arr[i]);
            }
        }
        System.out.println("Tổng số sinh viên pass là "+ count+"/"+size);
    }

}

