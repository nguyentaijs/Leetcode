public class L26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int uniqueCount = 1;
        for (int curIndex = 1; curIndex < nums.length; curIndex++) {
            if (nums[curIndex] != nums[curIndex - 1]) {
                nums[uniqueCount] = nums[curIndex];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
