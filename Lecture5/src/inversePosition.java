import java.util.Scanner;

public class inversePosition {
    public static void Main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(inverse(n));
    }

    public static int inverse(int n) {
        int sum = 0;
        int placed = 1;
        while (n>0) {
            int rem = n%10;
            sum= (int) (sum+placed*Math.pow(10,rem-1));
            n=n/10;
        }
        return sum;
    }
}
