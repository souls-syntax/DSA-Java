public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {2,7,1};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] arr) {
        int min = arr[0];
        int min_i = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                min_i = i;
            }
        }
        int max = arr[min_i];
        int max_i = min_i;
        for (int j = max_i; j< (arr.length-max_i+1); j++) {
            if (arr[j] > max) {
                max = arr[j];
                max_i = j;
            }
        }
        return max - min;
    }
}
