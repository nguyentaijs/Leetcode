import java.util.*;

public class L819_MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        Collections.addAll(bannedSet, banned);

        String[] words = paragraph.toLowerCase().split("\\W+");
        Map<String, Integer> result = new HashMap<>();

        int max = 0;
        String maxVal = "";
        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) {
                continue;
            }

            int times = 1;
            if (result.containsKey(word)) {
                times += result.get(word);
            }
            result.put(word, times);
            if (max < times) {
                max = times;
                maxVal = word;
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        L819_MostCommonWord mostCommonWord = new L819_MostCommonWord();
        System.out.println(mostCommonWord.mostCommonWord("abc abc? abcd the jeff!", new String[]{"abc","abcd","jeff"}));
    }

}
