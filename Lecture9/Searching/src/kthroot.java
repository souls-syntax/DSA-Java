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
            if (Math.pow(mid, k) <= 2) {
                ans = mid;
                l = mid +1;

            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
}
