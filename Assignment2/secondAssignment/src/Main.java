// Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int index = 1;
        int p = n;
        int evenSum = 0;
        int oddSum = 0;
        while(p>0) {
            int temp = p%10;
            if(index%2 ==0) {
                evenSum += temp;
            }
            else {
                oddSum += temp;
            }
            p = p/10;
            index++;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}