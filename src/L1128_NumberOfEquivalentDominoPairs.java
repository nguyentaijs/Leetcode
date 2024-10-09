import java.util.HashMap;
import java.util.Map;

public class L1128_NumberOfEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <dominoes.length; i++) {
            String key = String.format("%d-%d", Math.min(dominoes[i][0], dominoes[i][1]), Math.max(dominoes[i][0], dominoes[i][1]));
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int count = 0;
        for(Integer value: map.values()) {
            if((value > 1)) {
                count = count + (value * (value - 1)) / 2;
            }
        }
        return count;
    }
}
