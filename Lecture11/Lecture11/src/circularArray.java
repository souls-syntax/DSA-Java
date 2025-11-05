public class circularArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-7,1,-4,4,-1,5,6};
        System.out.println(circularSUm(arr));
    }
    public static int circularSUm(int[] arr) {
        int linearMax = Maximum_Sum(arr);
        int total_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            total_sum += arr[i];
        }
        int circularSUm = total_sum - mini_Sum(arr);
        if (circularSUm == 0) {
            return linearMax;
        }
        return Math.max(linearMax,circularSUm);
    }

    public static int Maximum_Sum(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
    public static int mini_Sum(int[] arr) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.min(ans, sum);
            if(sum > 0) {
                sum = 0;
            }
        }
        return ans;
    }
}











