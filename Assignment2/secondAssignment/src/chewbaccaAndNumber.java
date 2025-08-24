import java.util.Scanner;

public class chewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int newNum = 0;
        int placeValue = 1;
        while (n > 0) {
            int temp = n%10;
            if(temp > (9-temp)) {
                newNum = (newNum) + ((9-temp)*placeValue);
            }
            else {
                newNum = (newNum) + (temp*placeValue);
            }
            n=n/10;
            placeValue = placeValue*10;
        }
        System.out.println(newNum);
    }
}
