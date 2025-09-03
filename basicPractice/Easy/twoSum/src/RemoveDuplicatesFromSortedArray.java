public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        removeDuplicates(nums);
        for (int i = 0; i< nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int removeDuplicates(int[] arr) {
        int k = 1;

        for (int i = 1; i< arr.length; i++ ) {
            if (arr[i] != arr[i-1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
