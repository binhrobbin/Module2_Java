
public class NhiPhan {
    static int[] arr = {2,3,4,6,8,9,12,16};
    public static int binarySearch(int[] arr, int k){
        int left = 0, right = arr.length -1,mid = 0;
        while (left<=right){
            mid = (left+right)/2;
        if (arr[mid] == k) return mid;
           else if (k > arr[mid]) left = mid +1;
                else right = mid -1;
        }return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(arr,7));
    }
}