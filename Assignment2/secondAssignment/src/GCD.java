import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        System.out.println(gcd(m,n));
    }
    private static int gcd(int a, int b){
        int k = Math.max(a,b);
        int l = Math.min(a,b);
        if (k%l == 0) {
            return l;
        }
        else {
            return gcd(l,k%l);
        }
    }
}
