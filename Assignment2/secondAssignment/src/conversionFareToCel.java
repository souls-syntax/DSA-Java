import java.util.Scanner;

public class conversionFareToCel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = input.nextInt();
        int max = input.nextInt();
        int step = input.nextInt();
        int faren = min;
        int cel=0;
        while (min <= max) {
            cel = (faren-32)*5/9;
            System.out.println(faren+" "+cel);
            min = min + step;
            faren = min;
        }

    }
}
