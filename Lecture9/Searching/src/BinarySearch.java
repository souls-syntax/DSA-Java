import javax.naming.directory.SearchControls;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,8,9,13,16,18,19,20,21};
        int item = 13;
        System.out.println(Search(arr, item));
    }
    public static int Search(int[] arr, int item) {
        int l0 = 0;
        int hi = arr.length-1;
        while (l0<=hi) {
            int mid=(l0+hi)/2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] > item) {
                hi = mid -1;
            } else {
                l0 = mid + 1;
            }
        }
        return l0;
    }
}
