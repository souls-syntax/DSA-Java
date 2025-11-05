import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [] [] arr = new int[n] [m];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j]= sc.nextInt();
//            }
//        }
        int [] [] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        transpose(arr);
//        int i = 0;
//        while(i < arr[0].length) {
//            if (i%2 == 0) {
//                for (int j = 0; j < arr.length; j++) {
//                    System.out.println(arr[j][i]);
//                }
//            }
//            else {
//                for (int j = arr.length-1; j >= 0; j++) {
//                    System.out.println(arr[j][i]);
//                }
//            }
//            System.out.println();
//            i++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
    }

    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
