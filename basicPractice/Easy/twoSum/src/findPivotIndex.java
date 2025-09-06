public class findPivotIndex {
    public static void main(String[] args) {
        int[] pup = {1,7,3,6,5,6};
        System.out.println(pivotIndex(pup));
    }

    public static int pivotIndex(int[] arr) {
        int[] ari = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            ari[i] = sum;
        }
        int pk = 1;

        for (int j = 0; j < arr.length; j++) {
            if (pk >= arr.length-1) {
                return -1;
            }
            if (ari[j] == ari[ari.length-1] - (arr[pk] + ari[j])) {
                return pk;
            }
            pk++;
        }
        return -1;
    }
}
