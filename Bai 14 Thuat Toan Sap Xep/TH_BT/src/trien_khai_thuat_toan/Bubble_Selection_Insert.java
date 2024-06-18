package trien_khai_thuat_toan;

import java.util.Arrays;

public class Bubble_Selection_Insert {
    public static void main(String[] args) {
        int[] array = new int[]{3,5,2,6,1,32,52,34,88,9};
        bubbleSort(array);
        selectionSort(array);
        insertionSort(array);
    }
    public static void bubbleSort(int[] arr){
        boolean checkOn = true;
        for (int i = 0; i < arr.length-1 && checkOn; i++) {
            checkOn =false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    checkOn = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
