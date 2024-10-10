import java.util.Arrays;

public class L1005_MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        Arrays.sort(nums);
        if ( k%2 == 1) {
            nums[0] = -nums[0];
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        L1005_MaximizeSumOfArrayAfterKNegations sum = new L1005_MaximizeSumOfArrayAfterKNegations();
        System.out.println(sum.largestSumAfterKNegations(new int[]{-8, 3, -5, -3, -5, -2}, 6));
    }
}
