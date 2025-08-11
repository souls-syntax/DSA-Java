public class loop8 {
    public static void main(String[] args) {
        int s = 5;
        int row = 1;
        while (row <= s) {
            int c = 1;
            while (c <= s) {
                if (row == c || c == s - row + 1) {
                    System.out.print("* ");
                }
                else  {
                    System.out.print("  ");
                }
                c++;
            }
            row++;
            System.out.println();
        }
    }
}
