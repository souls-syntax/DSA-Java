public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 3, 4, 6, 7, 8};
        int item = 67;
        System.out.println(linear_search(arr, item));
    }

    public static int linear_search(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }
        return -1;
    }
}
