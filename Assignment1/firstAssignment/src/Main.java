import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Pattern Triangle
        //n row
        //star =1 | star + 2
        // vertical mirror so mirror in star loop
        //Normal ass triangle
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;
        int val = 1;

        while (row<=n) {
            //space
            int vale  = val;
            int i = 1;
            while(i<=space) {
                System.out.print("  ");
                i++;
            }
            //value
            int j = 1;
            while (j<=star) {
                System.out.print(vale+" ");
                j++;
                if(j<=star/2+1) {
                    vale++;
                }
                else {
                    vale--;
                }
            }
            row++;
            star+=2;
            space--;
            System.out.println();
            val++;
        }
    }
}