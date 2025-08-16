import java.util.Scanner;

public class doubleSidedArrow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = 7;//input.nextInt();
        int n = p;
        int row = 1;
        int star = 1;
        int space1 = n - 1;
        int space2 = -1;
        int Value = 1;
        while (row<=n) {
            //space
            int val = Value;
            int i = 1;
            while (i<=space1) {
                System.out.print("  ");
                i++;
            }
            if (row == 1 || row == n) {
                System.out.print(1);
            }
            else {
                //star
                int j = 1;
                while (j<=star) {
                    System.out.print(val+" ");
                    j++;
                    val--;
                }
                //space
                int k = 1;
                while (k<=space2) {
                    System.out.print("  ");
                    k++;
                }
                //star
                int l = 1;
                while (l<=star) {
                    val++;
                    System.out.print(val+" ");
                    l++;
                }
            }
            //mirror
            if (row <= n/2) {
            star++;
            space1-=2;
            space2+=2;
            Value++;

            }
            else {
                star--;
                space1+=2;
                space2-=2;
                Value--;
            }
            row++;
            System.out.println();
        }
    }
}
