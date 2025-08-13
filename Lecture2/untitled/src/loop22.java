public class loop22 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = n;
        int space = -1;
        while(row<=n) {
            //star
            int i = 1;
            while(i<=star) {
                System.out.print("* ");
                i++;
            }
            //space
            int j = 1;
            while(j<=space) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if (row == 1) {
                k = 2;
            }
            while (k<= star){
                System.out.print("* ");
                k++;
            }
            //Next line prep
            System.out.println();
            row++;
            star--;
            space = space + 2;
        }
    }
}
