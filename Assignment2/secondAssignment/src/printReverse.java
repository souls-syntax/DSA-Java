import java.util.Scanner;

//Take N as input, Calculate it's reverse also Print the reverse
public class printReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 123456789;//input.nextInt();
        int p = n;
        int reverse = 0;
        while (p>0) {
            int temp = p%10;
            reverse = (reverse*10) + temp;
            p = p/10;
        }
        System.out.println(reverse);
    }
}
