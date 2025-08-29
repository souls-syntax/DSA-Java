import java.util.Arrays;

public class twoPointerApproach {
    public static int[] indexi1(int[] arr, int a) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i<j) {
            int temp = arr[i]+arr[j];
            if (temp == a) {
                break;
            } else if (temp > a) {
                j--;
            } else {
                i++;
            }
        }
        int[] arri = {i,j};

        return arri;
    }
}
