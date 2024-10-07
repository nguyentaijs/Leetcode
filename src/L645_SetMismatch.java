import java.util.*;

public class L645_SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int missing = -1;
        int duplicate = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(i + 1) == null) {
                missing = i + 1;
            } else if (map.get(i + 1) == 2) {
                duplicate = i + 1;
            }

        }
        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        L645_SetMismatch l645SetMismatch = new L645_SetMismatch();
        System.out.println(Arrays.toString(l645SetMismatch.findErrorNums(new int[]{3, 2, 2})));
    }
}
