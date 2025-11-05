// Hidden search space problem
// Difficult
// Uber

import java.util.Arrays;
import java.util.Scanner;

public class aggcows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nos = sc.nextInt();
        int noc = sc.nextInt();
        int[] stall = new int[noc];
        for (int i = 0; i < stall.length; i++) {
            stall[i] = sc.nextInt();
        }
        Arrays.sort(stall);
    }

    public static int maximumDistance(int[] stall, int noc) {
        int n = stall.length;
        int lo = 0;
        int hi = stall[n-1] - stall[0];
        int ans = 0;
        while (lo<=hi) {
            int mid = (lo+hi)/2;
            if (isPossible(stall,noc,mid)) {
                ans = mid;
                lo = mid+1;
            }
            else {
                hi = mid - 1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] stall, int noc, int mid) {
        int cow =1;
        int pos = stall[0];
        for (int i = 0; i < stall.length; i++) {
            if (stall[i] - pos >= mid) {
                cow++;
                pos = stall[i];
            }
            if (noc == cow) {
                return true;
            }
        }
        return false;
    }
}
