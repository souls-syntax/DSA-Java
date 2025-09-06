public class productOfArrayExceptItself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] mul = moreOpti(arr);
        for (int i = 0; i < mul.length; i++) {
            System.out.println(mul[i]);
        }
    }
    public static int[] MulArrX(int[] arr) {
        int n = arr.length;

        int[] left = new int[n];

        left[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            left[i] = left[i-1]*arr[i-1];
        }

        int[] right = new int[n];

        right[n-1] = 1;
        for (int i = n-2; i >=0; i--) {
            right[i] = right[i+1]*arr[i+1];
        }

        for (int i = 0; i < arr.length; i++) {
            left[i] = left[i] * right[i];
        }
        return left;
   }

   public static int[] moreOpti(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        res[0] = 1;
       for (int i = 1; i < arr.length; i++) {
           res[i] = res[i-1] * arr[i-1];
       }

       int suf = 1;
       for (int i = n-1; i>=0;i--) {
           res[i] *= suf;
           suf *= arr[i];
       }
       return res;
   }
}
