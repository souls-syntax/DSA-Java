public class reverse_algo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        Rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void arrayReversal(int[] arr, int i, int j) {
        //int i = a;
        //int j = b;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
        public static void Rotate ( int[] arr, int k){
            int n = arr.length;
            k = k % n;
            //Starting ke n-k element reverse
            arrayReversal(arr,0, n-k-1);

            // last ke K element reverse
            arrayReversal(arr, n-k,n-1);
            // all element reverse
            arrayReversal(arr,0,n-1);
    }
}
