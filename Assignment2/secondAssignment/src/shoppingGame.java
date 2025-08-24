import java.util.Scanner;

public class shoppingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            int m = input.nextInt();//Ayush
            int n = input.nextInt();//Harsh
            int a = 0;
            int h = 0;
            int phone = 1;
            while (true) {
                a = a + phone;
                if (a > m) {
                    System.out.println("Harshit");
                    break;
                }
                phone++;
                h = h + phone;
                if (h > n) {
                    System.out.println("Aayush");
                    break;
                }
                phone++;
            }
            t--;
        }
    }
}
