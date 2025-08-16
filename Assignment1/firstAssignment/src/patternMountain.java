import java.util.Scanner;

public class patternMountain {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n = 9;// input.nextInt();
        //int n = p/2+1;
        int row = 1;
        int star = 1;
        int space = 2*n-3;
        while (row<=n) {
            int value = 1;
            // Numbers/stars

            int i = 1;
            while (i<=star) {
                System.out.print(value+" ");
                i++;
                value++;
            }
            //Space
            int j = 1;
            while (j<=space) {
                System.out.print("  ");
                j++;
            }

            //Star/number
            int k = 1;
            if(row==n){
                k = 2;
                value--;
            }
            while (k<=star) {
                value = value-1;
                System.out.print(value+" ");

                k++;
            }

            row++;
            star++;
            space-=2;
            System.out.println();

        }
    }
}
