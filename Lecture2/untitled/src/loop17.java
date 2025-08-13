public class loop17 {
    public static void main(String[] args) {
        int n = 7;
        int row = 1;
        int star = (n-1)/2;
        int space = 2;

        while(row <= n) {

            //Upper Part
            //one side star
            int i = 1;
            while(i <=star) {
                System.out.print("* ");
                i++;
            }
            //Upside space
            int j = 1;
            while(j<=space) {
                System.out.print("  ");
                j++;
            }
            //upside star
            int k = 1;
            while (k<=star) {
                System.out.print("* ");
                k++;
            }
            //mirror

            if (row < n/2+1){
                star--;
                space = space + 2;
            }
            else {
                star++;
                space = space - 2;
            }
            System.out.println();
            row++;
        }
    }
}
