public class second {
    public static void main(String[] args) {
//        int[] arr0 = new int[]{10,20,30,40};
        int[] arr = {10,20,30,40,50};
        int[] other = {1,2,3,4,5};
        System.out.println(arr[0]+" "+other[0]);
        Swap(arr, other);
        System.out.println(arr[0]+" "+other[0]);
    }

    public static void Swap(int[] arr, int[] other) {
        int[] temp = arr;
        arr = other;
        other = temp;
    }
}
