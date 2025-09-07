import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] aop = Pinverse(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(aop[i] + " ");
        }
    }

    public static void invertedArr(int[] arr) {
        int n = arr.length;
        int l = 0;
        int h = n-1;
        
        while (l<h) {
            int tem = arr[l];
            arr[l] = arr[h];
            arr[h] = tem;
            l++;
            h--;
        }
    }
    public static int[] Pinverse(int[] arr) {
        int n = arr.length;
        
        
        int[] ari = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int tem = arr[i];
            ari[tem] = i;
        }
        return ari;
    }
}
