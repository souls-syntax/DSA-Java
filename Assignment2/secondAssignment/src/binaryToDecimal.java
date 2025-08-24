import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int index = 0;
        int sum = 0;
        while (n>0) {
            int temp = n%10;
            if (temp == 1) {
                sum = sum + pow(index, 2);
            }
            index++;
            n = n/10;
        }
        System.out.println(sum);
    }

    public static int pow(int a, int b) {
        int result = 1;
        while (a>0) {
            result = result*b;
            a--;
        }
        return result;
    }
}
