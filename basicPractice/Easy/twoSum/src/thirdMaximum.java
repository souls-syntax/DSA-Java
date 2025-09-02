import java.lang.reflect.Array;
import java.util.Arrays;

public class thirdMaximum {
    public static void main(String[] args) {
        int[] arr = {2,2,3,1};
        System.out.println(maxi(arr));
    }
    public static int maxi(int[] arr) {
        Arrays.sort(arr);
        if (arr.length < 3) {
            return arr[arr.length-1];
        }
        int thir = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            
        }
    }
}
