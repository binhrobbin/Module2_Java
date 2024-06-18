public class Th1_NhiPhan {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    public static int binarySearch(int[] list, int key){
        int low = 0,mid, hight = list.length -1;
        while (hight>=low){
            mid = (hight+low)/2;
            if (key>list[mid]){
                low = mid +1;
            } else if (key<list[mid]) {
                hight = mid -1;
            }else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }
}
