public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        Rotate(arr, k);
        for (int i =0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void Rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        //for(int j = 1; j<=k; j++) {
            int item = arr[n - k];
            for (int i = n - (k+1); i >= 0; i--) {
                arr[i + k] = arr[i];
            }
            arr[0] = item;
        //}
    }
}