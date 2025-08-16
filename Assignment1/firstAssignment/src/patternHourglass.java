import java.util.Scanner;

public class patternHourglass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = 5;//input.nextInt();
        int n =  p;
        int row = 1;
        int star = 2*n+1;
        int space = 0;
        int Value = p;
        while (row<=2*n+1) {
            int val = Value;
            //space
            int j = 1;
            while (j<=space) {
                System.out.print("  ");
                j++;
            }
            //stars
            int i = 1;
            while (i <= star) {
                System.out.print(val+" ");
                if (i<=star/2) {
                    val--;
                }
                else {
                    val++;
                }
                i++;
            }
            //mirror
            if(row<=n){
            star -= 2;
            space++;
            Value--;
            }
            else {
                star += 2;
                space--;
                Value++;
            }
            System.out.println();
            row++;
        }
    }
}
