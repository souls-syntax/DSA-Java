import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 2;
        int flag = 0;
        while(i < n) {
            if (n%i == 0) {
                flag = 1;
                break;
            }
            i++;
        }
        if (flag == 1) {
            System.out.println("Not Prime");
        }
        else {
            System.out.println("Prime");
        }
    }
}
