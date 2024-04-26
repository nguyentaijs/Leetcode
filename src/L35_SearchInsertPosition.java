public class L35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        while(max >= min) {
            int mid = min + (max - min) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}
