import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(palindromeCheck(121));
    }
    public static boolean palindromeCheck(int a) {
        if (a<0) {
            return false;
        }
        else {
            int sum = 0;
            while(sum < a) {
                sum = (sum*10) + a%10;
                a /= 10;
            }
            if(sum == a || a == sum/10) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}