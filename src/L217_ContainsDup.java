import java.util.HashSet;
import java.util.Set;

public class L217_ContainsDup {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        // test the containsDuplicate method
        L217_ContainsDup test = new L217_ContainsDup();
        int[] nums = {1, 2, 3, 4, 5, 1};
        System.out.println(test.containsDuplicate(nums)); // Output: false
    }
}
