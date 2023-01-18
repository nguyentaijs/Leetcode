import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class L2418_SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> peopleMap = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < names.length; i++) {
            peopleMap.put(heights[i], names[i]);
        }
        String[] finalResult = new String[names.length];
        int i = 0;
        for (String value : peopleMap.values()) {
            finalResult[i] = value;
            i++;
        }
        return finalResult;
    }

    // Sort peoples 2
    public String[] sortPeople2ndApproach(String[] names, int[] heights) {
        int arrLength = names.length;
        int[][] heightOfPeople = new int[arrLength][2];

        // Init array with current index and actual height
        for (int i = 0; i < arrLength; i++) {
            heightOfPeople[i][0] = i;
            heightOfPeople[i][1] = heights[i];
        }

        // Sort descendent by height
        Arrays.sort(heightOfPeople, (x, y) -> y[1] - x[1]);

        // Fill the result array with names according to index
        String[] results = new String[arrLength];
        for (int i = 0; i < arrLength; i++) {
            results[i] = names[heightOfPeople[i][0]];
        }
        return results;
    }
}
