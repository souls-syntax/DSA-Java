import java.util.Scanner;

public class bostonNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //System.out.println(sumOfDigit(n));
        //System.out.println(sumOfFactor(n));
        if (sumOfDigit(n) == sumOfFactor(n)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

    }
    private static int sumOfDigit(int a) {
        int sum = 0;
        while (a>0) {
            sum = sum + (a%10);
            a /=10;
        }
        return sum;
    }
    private static int sumOfFactor(int a) {
        int i = 2;
        int sum = 0;
        while(i*i<=(a)) {
            while(a%i == 0) {
                sum = sum + sumOfDigit(i);
                a /= i;
            }
            i++;
        }
        if (a>1) {
            sum = sum + sumOfDigit(a);
        }
        return sum;
    }
}
