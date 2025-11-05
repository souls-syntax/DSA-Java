public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
    }
    public static void nextPermutation(int[] arr) {
        int p = -1;
        for (int i = arr.length-2; i >=0 ; i--) {
            if (arr[i] < arr[i+1]) {
                p = i;
                break;
            }
        }
        if (p==-1) {
            arrayReversal(arr,0,arr.length-1);
            return;
        }
        int q = -1;
        for (int i = arr.length - 1; i >p; i--) {
            if (arr[i]>arr[p]) {
                q = i;
                break;
            }
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        arrayReversal(arr, p + 1, arr.length - 1);
    }

    public static void arrayReversal(int[] arr, int a, int b) {
        int i = a;
        int j = b;
        while ( i<j ) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
