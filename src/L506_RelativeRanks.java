import java.util.Map;
import java.util.TreeMap;

public class L506_RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, String> scoreMap = new TreeMap<>((a, b) -> Integer.compare(score[b], score[a]));
        for (int i = 0; i < score.length; i++) {
            scoreMap.put(i, String.valueOf(i));
        }

        int count = 0;
        for (Map.Entry<Integer, String> entry : scoreMap.entrySet()) {
            if (count == 0) {
                scoreMap.put(entry.getKey(), "Gold Medal");
            } else if (count == 1) {
                scoreMap.put(entry.getKey(), "Silver Medal");
            } else if (count == 2) {
                scoreMap.put(entry.getKey(), "Bronze Medal");
            } else {
                scoreMap.put(entry.getKey(), String.valueOf(count + 1));
            }
            count++;
        }

        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            result[i] = scoreMap.get(i);
        }
        return result;
    }
}
