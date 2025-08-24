import java.util.Scanner;

public class oddAndEvenBackInDelhi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t>0) {
            int n = input.nextInt();
            int evenSum = 0;
            int oddSum = 0;
            while (n>0) {
                int temp = n%10;
                if(temp%2==0){
                    evenSum += temp;
                }
                else {
                    oddSum += temp;
                }
                n /= 10;
            }
            if(oddSum%3 == 0 || evenSum%4==0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            t--;
        }

    }
}
