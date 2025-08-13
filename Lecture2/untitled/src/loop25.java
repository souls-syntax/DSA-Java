public class loop25 {
    public static void main(String[] args) {
        int n = 5;
        int start = 1;
        int space = n-1;
        int row = 1;
        int val = 1;
        while(row <= n) {
            int i = 1;
            while (i<= space) {
                System.out.print("\t");
                i++;
            }
            //star
            int j = 1;
            while (j<=start) {
                System.out.print(val+"\t");
                j++;
                val++;
            }
            System.out.println();
            row++;
            start+=2;
            space--;
            //val++;
        }
    }
}
