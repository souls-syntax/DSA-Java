import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int j=1;
        while (j<=n) {
            while(i<=n) {
                System.out.print("* ");
                i = i+1;
            }
            i = 1;
            System.out.print("\n");
            j = j+1;
        }
    }
}
