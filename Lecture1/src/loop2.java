public class loop2 {
    public static void main(String[] args) {
        int n=5;
        int m=n-1;
        int i=1;
        int j=1;
        while (j<=n) {
            int k = 1;
            while (k<=m) {
                System.out.print("  ");
                k++;
            }
            int l=1;
            while (l<=j) {
                System.out.print("* ");
                l++;
            }
            i++;
            System.out.print("\n");
            j = j+1;
            m--;
        }
    }
}
