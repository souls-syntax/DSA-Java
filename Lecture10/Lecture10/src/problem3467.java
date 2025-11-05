class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;

        int evenCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i]%2==0) {
                evenCount++;
            }
        }

        for (int i = 0; i < evenCount; i++) {
            nums[i] = 0;
        }
        for (int i = evenCount; i < n; i++) {
            nums[i] = 1;
        }
        return nums;
    }
}
