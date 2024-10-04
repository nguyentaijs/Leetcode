import java.util.HashMap;
import java.util.Map;

public class L136_SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (result.get(nums[i]) == null) {
                result.put(nums[i], 1);
            } else {
                result.put(nums[i], result.get(nums[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        L136_SingleNumber test = new L136_SingleNumber();
        int[] nums = {4,1,2,1,2};
        System.out.println(test.singleNumber(nums)); // Output: 1
    }
}
