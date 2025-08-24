import java.util.Scanner;

public class inverseOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int index = 1;
        int sum = 0;
        while (n>0) {
            int temp = n%10;
            sum = sum + index* (int) Math.pow(10, (temp-1));
            index++;
            n /= 10;
        }
        System.out.println(sum);
    }
}
