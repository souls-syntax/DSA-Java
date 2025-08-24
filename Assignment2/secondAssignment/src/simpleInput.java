import java.util.Scanner;

public class simpleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        while (sum>=0) {
            int n = input.nextInt();
            sum = sum + n;
            if(sum>=0) {
                System.out.println(n);
            }
        }
    }
}
