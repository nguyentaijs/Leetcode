import java.util.Arrays;

public class L283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int next0Position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[next0Position] = nums[i];
                next0Position++;
            }
        }
        for (int i = next0Position; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        // test
        int[] nums = {0, 1, 0, 3, 12, 0, 0, 0, 111, 123,424};
        L283_MoveZeroes moveZeroes = new L283_MoveZeroes();
        moveZeroes.moveZeroes(nums);
        System.out.println(Arrays.toString(nums)); // Output: [1, 3, 12, 0, 0]
    }
}
