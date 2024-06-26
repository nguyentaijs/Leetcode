import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L2441_LargestPositiveIntegerThatExistsWithItsNegative {

    public static final int FOUND_BOTH_NEGATIVE_POSITIVE = 0;
    public static final int FOUND_NEGATIVE = -1;
    public static final int FOUND_POSITIVE = 1;

    public int findMaxK(int[] nums) {
        Map<Integer, Integer> resultMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (!resultMap.containsKey(nums[i])) {
                    resultMap.put(nums[i], FOUND_POSITIVE);
                } else if (resultMap.get(nums[i]) == FOUND_NEGATIVE) {
                    resultMap.put(nums[i], FOUND_BOTH_NEGATIVE_POSITIVE);
                }
            } else {
                if (!resultMap.containsKey(-nums[i])) {
                    resultMap.put(-nums[i], FOUND_NEGATIVE);
                } else if (resultMap.get(-nums[i]) == FOUND_POSITIVE) {
                    resultMap.put(-nums[i], FOUND_BOTH_NEGATIVE_POSITIVE);
                }
            }
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
            if (entry.getValue() == FOUND_BOTH_NEGATIVE_POSITIVE && max < entry.getKey()) {
                max = entry.getKey();
            }
        }
        return max;
    }
    public int findMaxK_2ndApproach(int[] nums) {
        Set<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            resultSet.add(nums[i]);
        }
        int max = -1;
        for (Integer item : resultSet) {
            if (resultSet.contains(-item) && max < Math.abs(item)) {
                max = Math.abs(item);
            }
        }
        return max;
    }
}
