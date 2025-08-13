public class loop7 {
    public static void main(String[] args) {
    int s = 7;
    int row = 1;
    while (row <= s) {
        int c = 1;
            while (c <= s) {
                if (row == s || c == s || row == 1 || c == 1) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");
                }
                c = c + 1;
            }
            row = row + 1;
            System.out.println();

        }
    }
}