import java.util.Scanner;
public class r4Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 9;// input.nextInt();
        //int n = p/2+1;
        int row = 1;
        int star = 1;
        //int space = ;
        while (row<=n) {
            int i = 1;
            while (i<star) {
                System.out.print("* ");
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
