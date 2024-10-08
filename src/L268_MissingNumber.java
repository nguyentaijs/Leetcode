import java.util.HashSet;
import java.util.Set;

public class L268_MissingNumber {
    public int missingNumber(int[] nums) {
        int totalSum = 0;
        int numSum = 0;
        for (int i = 0; i <= nums.length; i++) {
            totalSum += i;
            if (i < nums.length) {
                numSum += nums[i];
            }
        }
        return totalSum - numSum;
    }

    public static void main(String[] args) {
        L268_MissingNumber missingNumber = new L268_MissingNumber();
        System.out.println(missingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
