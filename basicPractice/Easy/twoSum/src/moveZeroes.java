public class moveZeroes {
    public static void main(String[] args) {

    }
    public static int[] MoveZero(int[] arr) {
        int[] arri = arr;
        int k = 0;

        for (int i = 0; i< arr.length; i++) {
            if (arri[i] != 0) {
                arri[k] = arr[i];
                k++;
            }
        }
        for (int j = k; j < arr.length; j++) {
            arri[j] = 0;
        }
        return arri;
    }
}
