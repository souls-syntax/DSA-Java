public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int num = 7;
        System.out.println(BinarySearchInsert(arr,num));
    }
    public static int BinarySearchInsert(int[] arr, int a) {
        int low = 0;
        int high = arr.length - 1;
        while (low<=high) {
            int mid = low + (high-low)/2;

            if(a == arr[mid]) {
                return mid;
            } else if (a>arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }
}
