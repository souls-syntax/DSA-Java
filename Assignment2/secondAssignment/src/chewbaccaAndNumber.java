import java.util.Scanner;

public class chewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long newNum = 0;
        long placeValue = 1;
        while (n > 0) {
            long temp = n%10;
            
            if(temp > (9-temp)) {
                if(n<10 && temp == 9) {
                    newNum = (newNum) + (temp*placeValue);
                }
                else {
                    newNum = (newNum) + ((9-temp)*placeValue);
                }
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
