import java.util.Arrays;

public class L628_MaximumProductOfThreeNumbers {
    /**
     * Max of last 3 items or first 2 items and the last item
     * @param nums
     * @return
     */
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n-1] * nums[n-2] * nums[n-3],
                nums[0] * nums[1] * nums[n-1]);
    }
    public static void main(String[] args) {
        L628_MaximumProductOfThreeNumbers max = new L628_MaximumProductOfThreeNumbers();
        System.out.println(max.maximumProduct(new int[] {-1,-2,2,3,4}));
    }
}
