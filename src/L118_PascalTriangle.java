import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L118_PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }

        result.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = result.get(i - 1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 1; j < i; j++) {
                cur.add(prev.get(j - 1) + prev.get(j));
            }
            cur.add(1);
            result.add(cur);
        }
        return result;
    }


    public static void main(String[] args) {
        L118_PascalTriangle test = new L118_PascalTriangle();
        List<List<Integer>> triangle = test.generate(5);
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
