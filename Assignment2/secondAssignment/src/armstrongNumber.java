import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int m = input.nextInt();
            while(n<=m){
                if(isArmstrong(n)) {
                    System.out.println(n);
                    n++;
                }
                else {
                    n++;
                }
            }

        }

        public static int len(int n) {
            int len = 0;
            while (n > 0) {
                len++;
                n = n / 10;
            }
            return len;
        }

        public static int pow(int a, int b) {
            int res = 1;
            while (b>0) {
                res = res * a;
                b--;
            }
            return res;
        }
        public static boolean isArmstrong(int a) {
            int p = a;
            int c = len(a);
            int sum = 0;
            while (a>0) {
                int rem = a%10;
                sum = sum + pow(rem, c);
                a = a/10;
            }
            return p == sum;
    }
}
