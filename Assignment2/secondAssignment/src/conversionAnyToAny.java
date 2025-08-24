import java.util.*;

public class conversionAnyToAny {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sb = input.nextInt();
        int db = input.nextInt();
        int sn = input.nextInt();
        int k = toDecimal(sn,sb);
        System.out.println(k);
        System.out.println(toDB(k,db));
    }
    private static int toDecimal(int a, int b) {
        int index = 0;
        int sum = 0;
        while(a>0) {
            int temp = a%10;
            sum = sum + (temp*(int) Math.pow(b,index));
            index++;
            a=a/10;
        }
        return sum;
    }
    private static int toDB(int a, int b) {
        int newNum = 0;
        int placeValue = 1;
        while(a>0) {
            int temp = a%b;
            newNum = (newNum) + temp*placeValue;
            a = a/b;
            placeValue *= 10;
        }
        return newNum;
    }
}
