import java.util.Scanner;

public class nthFibonnaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 1;
        int b = 0;
        int i = 2;
        if (n == 1) {
            System.out.println(b);
        } else if (n == 2) {
            System.out.println(a);
        }
        else {
            while (i <= n) {
                int temp = a;
                a = a + b;
                b = temp;
                i++;
            }
            System.out.println(a);
        }
    }
}
