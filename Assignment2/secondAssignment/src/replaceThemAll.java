import java.util.Scanner;

public class replaceThemAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long newNumber = 0;
        long placeValue = 1;
        while (n>0) {
            long temp = n%10;
            if (temp == 0) {
                newNumber = newNumber + (5*placeValue);
            }
            else {
                newNumber = newNumber + (temp*placeValue);
            }
            n = n/10;
            placeValue = placeValue*10;
        }
        System.out.println(newNumber);
    }
}
