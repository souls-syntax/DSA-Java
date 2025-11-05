package Theory;

import java.util.Arrays;

public class seive {
    public static void main(String[] args) {
        System.out.print(seive(10));
        
    }
    public static int seive(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i*i < isPrime.length; i++) {
            if (isPrime[i]) {
                for(int k = i*i; k <= n; k += i) {
                    isPrime[k] = false;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}
