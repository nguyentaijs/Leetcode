public class Lxxx_DeleteItemsFromAnArray {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                count ++;
                for(int j = i; j < nums.length -1; j++) {
                    nums[j] = nums[j+1];
                }
            }
        }
        return count;
    }
}
