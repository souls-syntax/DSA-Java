// This algorithm is to find the largest no for which the power k is less than or equal to n x^k <= n such largest value of x.

public class kthroot {
    public static void main(String[] args) {
        int n = 100;
        int bad = 30;
    }
    public static int KthRoot(int n , int k) {
        int l = 0;
        int h = n;
        int ans = 0;
        while (l<=h) {
            int mid = (l+h)/2;
            if (Math.pow(mid, k) <= n) {
                ans = mid;
                l = mid +1;

            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
}
