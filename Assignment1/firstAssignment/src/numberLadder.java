import java.util.Scanner;

public class numberLadder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 4;// input.nextInt();
        //int n = p / 2 + 1;
        int row = 1;
        int star = 1;
        int value = 1;
        //int space = n - 1;
        while (row <= n) {
            int i = 1;
            while (i<=star) {
                System.out.print(value+" ");
                value++;
                i++;
            }
            star++;
            row++;
            System.out.println();
        }
    }
}
