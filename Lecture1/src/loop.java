public class loop {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int j=1;
        while (n>=j) {
            while(i<=n) {
                System.out.print("* ");
                i = i+1;
            }
            i = 1;
            System.out.print("\n");
            n=n-1;
        }
    }
}
