public class TimMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1,68,6,3};
        System.out.println("Min của mảng đã cho là " + timMin(arr));
    }
    public static int timMin(int[] arr){
        int min = arr[0];
        for (int x:arr){
            if (min >x) min =x;
        }
        return min;
    }
}
