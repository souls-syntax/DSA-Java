public class removeElements {
    public static void main(String[] args) {
        int[] mums = {2,3,3,2};
        RemoveElements(mums, 2);
        for (int i = 0; i< mums.length; i++) {
            System.out.println(mums[i]);
        }
    }
    public static int RemoveElements(int[] arr, int a) {
        int k = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] != a) {
                arr[k++] = arr[i];
                //k++;
            }
        }
        return k;
    }
}
