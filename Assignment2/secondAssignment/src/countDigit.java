//Take the following as input.
//        A number
//        A digit
//        Write a function that returns the number of times digit is found in the number. Print the value returned.

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1234526;//input.nextInt();
        int d = 2;
        int count = 0;
        while(n>0) {
            int temp = n%10;
            if(temp == d) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
