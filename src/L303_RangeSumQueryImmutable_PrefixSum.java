public class L303_RangeSumQueryImmutable_PrefixSum {
    public static void main(String[] args) {
        NumArray2 numArray = new NumArray2(new int[]{-2, 0, 3, -5, 2, -1});

        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}

class NumArray2 {
    private final int[] sums;

    public NumArray2(int[] nums) {
        sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return sums[right];
        }
        return sums[right] - sums[left - 1];
    }
}
