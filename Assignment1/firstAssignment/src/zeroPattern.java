import java.util.Scanner;

public class zeroPattern {
//    1
//    2 2
//    3 0 3
//    4 0 0 4
//    5 0 0 0 5
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n = 9;// input.nextInt();
        //int n = p / 2 + 1;
        int row = 1;
        int star = 1;
        int zeroCount = -1;
        int value = 1;
        //int space = n - 1;

        while (row<=n) {
            if(row == 1){
                System.out.print(row);
            }
            else {
                System.out.print(value+" ");
                int i = 1;
                while (i<=zeroCount) {
                    System.out.print(0+" ");
                    i++;
                }
                System.out.print(value+" ");
            }
            row++;
            value++;
            zeroCount++;
            System.out.println();
        }

    }
}
