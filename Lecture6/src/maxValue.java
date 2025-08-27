public class maxValue {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11,13,4,90,37};
        System.out.println(Max_Value(arr));
    }
    public static int Max_Value2(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static int Max_Value(int[] arr) {
        int max = arr[0];
        for (int i = 0; i< arr.length; i++) {
            if(arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }
}
