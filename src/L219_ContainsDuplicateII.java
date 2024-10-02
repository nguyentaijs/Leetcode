import java.util.HashMap;
import java.util.Map;

public class L219_ContainsDuplicateII {
    /**
     * Not so good approach
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate_2nd(int[] nums, int k) {
        int first = 0;
        while (first < nums.length - 1) {
            for(int i = first + 1; i <= first + k && i < nums.length; i++) {
                if (nums[i] == nums[first]) {
                    return true;
                }
            }
            first++;
        }
        return false;
    }
    
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> check = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer val = check.get(nums[i]);
            if (val != null) {
                if (i - val <= k) {
                    return true;
                }
            }
            check.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,3,1,5}, 3));
    }
}
