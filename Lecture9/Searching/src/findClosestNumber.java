public class findClosestNumber {
    public static void main(String[] args) {

    }
    public static int closest(int a, int b, int c) {
        int firstDiff = Math.abs(c-a);
        int secondDiff = Math.abs(c-b);
        if (firstDiff < secondDiff) {
            return 1;
        } else if (secondDiff < firstDiff) {
            return 2;
        } else {
            return 0;
        }
    }
}
