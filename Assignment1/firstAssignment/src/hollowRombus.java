import java.util.Scanner;

public class hollowRombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 9;// input.nextInt();
        int row = 1;
        int star = n;
        int space = n-1;
        while (row<=n) {
            //space
            int i = 1;
            while (i<=space) {
                System.out.print(" ");
                i++;
            }
            //Star and space
            if(row == 1 || row == n) {
                int k = 1;
                while (k<=star) {
                    System.out.print("*");
                    k++;
                }
            }
            else {
                System.out.print("*");
                int j = 1;
                while (j <= (n-2)) {
                    System.out.print(" ");
                    j++;
                }
                System.out.print("*");
            }
            space--;
            row++;
            System.out.println();
        }
    }
}
