public class loop13 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        while (row<=(2*n-1)) {
            //star
            int i = 1;
            while(i<=star) {
                System.out.print("* ");
                i++;
            }
            // Mirror
            if(row<n) {
                star++;
            }
            else {
                star--;
            }

            //next line prep
            row++;
            System.out.println();
        }
    }
}
