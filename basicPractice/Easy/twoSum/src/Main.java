import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        // target 9
        int[] ans =indexi(nums, 9);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] indexi(int[] arr, int a) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i< arr.length; i++) {
            int temp = a - arr[i];
            if (map.containsKey(temp)) {
                return new int[] {map.get(temp),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }
}