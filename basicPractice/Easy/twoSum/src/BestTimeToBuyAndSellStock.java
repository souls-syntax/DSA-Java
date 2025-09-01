public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {2,7,1};
        System.out.println(maxiProfit(arr));
    }
    public static int maxiProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        int min_i = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                min_i = i;
            }
                int temp = arr[i] - min;
                if (temp > maxprofit) {
                    maxprofit = temp;
            }
        }
        return maxprofit;
    }
}
