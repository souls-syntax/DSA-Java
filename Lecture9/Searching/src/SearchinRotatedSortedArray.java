public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,56,7,0,1,2};
        int target = 0;
    }
    public static int Search(int[] arr, int target) {
        int l = 0;
        int h = arr.length-1;
        while (l<=h) {
            int mid = l + (h-l)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[l] <= arr[mid]) {//Upper line
                if(arr[l] >= target && arr[mid] < target) {
                    h = mid - 1;
                }
                else {
                    l = mid+1;
                }
            }
            else {// Lower line'
                if(arr[h] <= target && arr[mid] > target) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
}
