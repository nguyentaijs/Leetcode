public class L704_BinarySearch {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        L704_BinarySearch test = new L704_BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(test.search(nums, target)); // Output: 4
    }
}
