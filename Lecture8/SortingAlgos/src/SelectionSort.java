public class SelectionSort {
    public static void main(String[] args ) {
        int[] arr = {4, -1, 5, 3, 1, 2};
        System.out.println(Minimum_Index(arr,0));
        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void SelectionSort(int[] arr) {
        for (int i = 0; i< arr.length;i++) {
            int idx = Minimum_Index(arr, i);
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static int Minimum_Index(int[] arr, int idx) {
        int mini= idx;
        for (int i = idx + 1; i< arr.length;i++) {
            if (arr[i] < arr[mini]) {
                mini = i;
            }
        }
        return mini;
    }
}
