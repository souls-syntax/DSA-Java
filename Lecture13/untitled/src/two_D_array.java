import java.util.Scanner;

//import static jdk.internal.org.jline.utils.Colors.h;

public class two_D_array {
    public static void main(String[] args) {
//        int [] [] arr = new int [3][4];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] [] arr = new int[n] [m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        Sisplay(arr);
    }
    public static void Sisplay(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
