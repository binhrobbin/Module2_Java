import java.util.Arrays;

public class Op2_NhiPhan_DeQuy {
    static int deQuy_Binary(int[] arr, int left, int right, int value){
        int mid = (left+right)/2;
        if (left>right) return -1;
        else if (arr [mid]==value) return mid;
        else if (arr [mid]<value) return deQuy_Binary(arr,mid+1,right,value);
        else return deQuy_Binary(arr,left,mid-1,value);
    }
    public static void main(String[] args) {
        int[] array = {2,3,4,8,6,5,9,1,0,7};
        for (int k = 1; k < array.length; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i+1]) {
                        int temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                    }
            }
        }
        System.out.println("Mảng sau khi sắp xếp là "+ Arrays.toString(array));
        System.out.println("Vị trí trong mảng cần tìm là: "+deQuy_Binary(array,0,array.length-1,11));
    }
}
