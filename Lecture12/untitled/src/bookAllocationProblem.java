//Hidden binary search
//Difficult

import java.util.Scanner;

public class bookAllocationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nob = sc.nextInt();
        int nos = sc.nextInt();
        int[] page = new int [nob];
        for (int i = 0; i < page.length; i++) {
            page[i] = sc.nextInt(); 
        }
    }
    public static int MinimumPage(int[] page, int nos) {
        int lo = 0;
        int hi = 0;
        int ans = 0;
        for (int i = 0; i < page.length; i++) {
            hi += page[i];
        }
        while (lo<=hi) {
            int mid = (lo+hi)/2;
            if (isItPossible(page,nos,mid)) {
                ans = mid;
                hi = mid-1;
            }
            else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isItPossible(int[] page, int nos, int mid) {
        int student = 1;
        int readpage = 0;
        for (int i = 0; i < page.length;) {
            if (readpage+page[i] <= mid) {
                readpage += page[i];
                i++;
            }
            else {
                student++;
                readpage = 0;
            }
            if (student>nos) {
                return false;
            }
        }
        return true;
    }
}
