import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        //System.out.println(gcd(m,n));
        System.out.print(lcm(m,n));
    }
    private static int max(int a , int b) {
        if (a>b) {
            return a;
        }
        else {
            return b;
        }
    }
    private static int min(int a, int b) {
        if (a<b) {
            return a;
        }
        else {
            return b;
        }
    }
    private static int gcd(int a, int b) {
        int k = max(a, b);
        int l = min(a,b);
        if (k%l == 0) {
            return l;
        }
        else {
            return gcd(l,k%l);
        }
    }
    private static int lcm(int a, int b) {
        int k = gcd(a,b);
        return (a*b)/k;
    }
}
