import java.util.Scanner;

public class patternInvertedGlass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = 7;//input.nextInt();
        int n = p;
        int row = 1;
        int star = 1;
        int space = 2*n-1;
        int Value = p;
        while (row<=2*n+1) {
            int val = Value;
            //star
            int i = 1;
            while (i<= star) {
                System.out.print(val+" ");
                i++;
                val--;
            }
            //space
            int j = 1;
            while (j<= space) {
                System.out.print("  ");
                j++;
            }
            //star

            int k = 1;
            if(row == n+1){
                k = 2;
                val++;
            }
            while (k<= star) {
                val++;
                System.out.print(val+" ");
                k++;

            }

            //Mirror
            if(row<n+1) {
            star++;
            space-=2;

            }
            else {
                star--;
                space+=2;
            }
            row++;
            System.out.println();
        }
    }
}
