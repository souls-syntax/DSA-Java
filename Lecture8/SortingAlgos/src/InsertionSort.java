public class InsertionSort {
    public static void main(String[] args ) {
        int[] arr = {1,3,4,5,0,9,2};
        Insertion_Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void Insertion_Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Insert_Last_Element(arr,i);
        }
    }

    public static void Insert_Last_Element(int[] arr, int i) {
        int item  = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > item) {
            arr[j + 1] = arr[j];
            arr[j] = item;
            j--;
        }

    }
}
