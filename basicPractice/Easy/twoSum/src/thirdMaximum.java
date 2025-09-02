import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class thirdMaximum {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1};
        System.out.println(maxi(arr));
    }
    public static long maxi(int[] arr) {
        Long first = Long.MIN_VALUE;
        Long second = Long.MIN_VALUE;
        Long third = Long.MIN_VALUE;
        int k = 0;


        for (int i = 0; i< arr.length; i++) {
            if(arr[i] == first || arr[i] == second || arr[i] == third) continue;

            if (arr[i] > first) {
                third = second;
                second = first;
                first = (long) arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = (long) arr[i];
            } else if (arr[i] > third) {
                third = (long) arr[i];
            }
            k++;
        }
        if (third == Long.MIN_VALUE && k < 3) {
            return first;
        }

        return third;
    }
}
