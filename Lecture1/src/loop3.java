public class loop3 {
    public static void main(String[] args) {
        int n=5;
        int m=n-1;
        int i=1;
        int j=1;
        while (j<=n) {
            int k = 5;
            while (m<=k) {
                System.out.print("  ");
                k--;
            }
            int l=5;
            while (j<=l) {
                System.out.print("* ");
                l--;
            }
            i++;
            System.out.print("\n");
            j = j+1;
            m--;
        }
    }
}
