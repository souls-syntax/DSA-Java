import java.util.Scanner;

public class mirrorStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = 9;// input.nextInt();
        int n = p/2+1;
        int row = 1;
        int star = 1;
        int space = n-1;
        while (row <= 2*n+1) {

            //Space
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }

            //Star
            int j = 1;
            while (j<=star) {
                System.out.print("* ");
                j++;
            }

            //Mirror
            if(row<n) {
                space--;
                star += 2;
            }
            else {
                space++;
                star -= 2;
            }
            row++;
            System.out.println();
        }
    }
}
