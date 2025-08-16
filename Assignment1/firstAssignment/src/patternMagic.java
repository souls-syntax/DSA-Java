import java.util.Scanner;

public class patternMagic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = 5;// input.nextInt();
        int n = 2*p-1;
        int row = 1;
        int star = n/2+1;
        int space = -1;

        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print("*");
                i++;
            }
            int j = 1;
            while (j<=space) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            if(row == 1 || row == n){
                k = 2;
            }
            while (k <= star) {
                System.out.print("*");
                k++;
            }

            //Mirror
            if (row<=n/2) {
                star = star - 1;
                space += 2;
            }
            else {
                star = star + 1;
                space -= 2;
            }
            row++;
            System.out.println();
        }
    }
}
