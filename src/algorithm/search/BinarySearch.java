package algorithm.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 7, 11, 58, 100, 199, 200, 203};
        System.out.println(search(nums, 7));
    }

    private static int search(int[] nums, int searchValue) {
        int indexOfMax = nums.length - 1;
        int indexOfMin = 0;
        while (indexOfMax > indexOfMin) {
            int indexOfMid = (indexOfMax + indexOfMin) / 2;
            if (nums[indexOfMid] == searchValue) {
                return indexOfMid;
            } else if (nums[indexOfMid] > searchValue) {
                indexOfMax = indexOfMid - 1;
            } else {
                indexOfMin = indexOfMid + 1;
            }
        }
        return -1;
    }
}
