import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // thêm 11 vào cuối mảng
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = 11;
        arr = newArr;
        System.out.println(Arrays.toString(arr));

        // thêm 11 vào vị trí index của mảng
        int index = 4;
        int[] newArr2 = new int[8];
        newArr2[index] = 11;
        for (int i = 0; i < arr.length; i++) {
            if (i<index) newArr2[i] = arr[i];
            else newArr2[i+1] = arr[i];
        }
        arr = newArr2;
        System.out.println(Arrays.toString(arr));

        // xóa phần tử ở vị trí 3
        int[] newArr3 = new int[7];
        for (int i = 0; i < newArr3.length; i++) {
            if (i<3) newArr3[i] = arr[i];
            else newArr3[i] = arr[i+1];
        }
        arr = newArr3;
        System.out.println(Arrays.toString(arr));

        // xóa phần tử ở vị trí đầu
        int[] newArr4 = new int[6];
        for (int i = 0; i < newArr4.length; i++) {
            newArr4[i] = arr[i + 1];
        }
        arr = newArr4;
        System.out.println(Arrays.toString(arr));
    }
}
