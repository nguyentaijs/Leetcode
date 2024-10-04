import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 1) {
            return new ArrayList<>(nums[0]);
        }
        List<String> finalString = new ArrayList<>();
        List<Stack<Integer>> singleResult = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            Stack<Integer> single = new Stack<>();
            if (single.peek() + 1 == nums[i]) {
                single.add(nums[i]);
            } else {
                singleResult.add(single);
                single = new Stack<>();
                single.add(nums[i]);
            }
        }
        for (Stack<Integer> integers : singleResult) {
            if (integers.size() == 1) {
                finalString.add(String.format("%d", integers.peek()));
            } else {
                finalString.add(String.format("%d%d", integers.elementAt(0), integers.peek()));
            }
        }
        return finalString;
    }

    public static void main(String[] args) {
        L228_SummaryRanges range = new L228_SummaryRanges();
        List<String> strings = range.summaryRanges(new int[]{1, 2});
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
