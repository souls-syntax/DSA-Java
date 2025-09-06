public class findPivotIndex {
    public static void main(String[] args) {
        int[] pup = {1,-1,2};
        System.out.println(pivotIndex(pup));
    }

    public static int pivotIndex(int[] arr) {
        int[] ari = new int[arr.length+1];
        int sum = 0;
        int k = 0;
        for (int i = 0; i < ari.length; i++) {
            ari[i] = sum;
            sum = sum + arr[k];
            if (k == arr.length-1) {
                continue;
            }
            k++;

        }
        for (int i = 0; i < ari.length; i++) {
            System.out.print(ari[i] + " ");
        }


        int pk = 0;

        for (int j = 0; j < arr.length; j++) {
            if (pk > arr.length-1) {
                return -1;
            }
            //System.out.print("\n"+ arr[pk]);
            if (ari[j] == ari[ari.length-1] - (arr[pk] + ari[j])) {
                return pk;
            }
            pk++;
        }
        return -1;
    }
    public static int PivIde(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (leftSum == total - (leftSum + arr[i])) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
