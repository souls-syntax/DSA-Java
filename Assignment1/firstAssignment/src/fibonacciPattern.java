import java.util.Scanner;

public class fibonacciPattern {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n = 4;// input.nextInt();
        //int n = p / 2 + 1;
        int row = 1;
        int star = 1;
        int sum = 1;
        int prev = 0;

        while (row<=n) {
            if (row ==1) {
                System.out.print(prev);
            }
            else {
                int i = 1;
                while (i <= star) {
                    System.out.print(sum + "\t");
                    int temp = sum;
                    sum = prev + sum;
                    prev = temp;
                    i++;
                }
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
