import java.util.Scanner;

public class printSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = 1;
        int p = 1;
        while (p<=n) {
            int temp = (3*k) + 2;
            if(temp%m != 0) {
                p++;
                System.out.println(temp);
            }
            k++;
        }
    }
}
