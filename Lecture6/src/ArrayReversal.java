public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        arrayReversal(arr);
        for (int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

//    public static void arrayReversal(int[] arr) {
//        int a = arr.length-1;
//        for(int i = 0; i< arr.length; i++) {
//            int temp = arr[a];
//            arr[a] = arr[i];
//            arr[i] = temp;
//            a--;
//            if(i>a) {
//                break;
//            }
//        }
    public static void arrayReversal(int[] arr) {
        int i = 3;
        int j = arr.length - 3;
        while ( i<j ) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
