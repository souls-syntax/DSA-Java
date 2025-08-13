import java.util.Scanner;

public class PatternRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3; //sc.nextInt();
        int star = 1;
        int space = n-1;
        int row = 1;
        int val = 1;
        while (row <= 2*n-1) {
            int vale = val;
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while (j <= star) {
                System.out.print(vale+" ");
                j++;
                if(j <= star/2+1) {
                    vale++;
                } else {
                    vale--;
                }
            }
            if (row < n) {
                star += 2;
                space--;
                val++;
            } else {
                star -= 2;
                space++;
                val--;
            }
            row++;
            System.out.println();
        }
    }
}
