public class loop4 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=5;
        int space=0;
        while(row<=n) {
            int i = 1;
            while(i<=space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star) {
                System.out.print("* ");
                j++;
            }
            row++;
            star--;
            space = space+2;
            System.out.print("\n");
        }
    }
}
