import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class L2114_MaxNumberOfWordsFoundInSentences {
    /***
     * Using Java builtin function split() to count words
     * @param sentences
     * @return
     */
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(int i = 0; i < sentences.length; i++) {
            int length = sentences[i].split(" ").length;
            if (length > maxCount) {
                maxCount = length;
            }
        }
        return maxCount;
    }

    /***
     * Faster by counting the spaces
     * @param sentences
     * @return
     */
    public int mostWordsFound_2ndApproach(String[] sentences) {
        if (sentences.length == 0) {
            return 0;
        }
        int maxCount = 0;
        for(int i = 0; i < sentences.length; i++) {
            int length = countSpaces(sentences[i]);
            if (length > maxCount) {
                maxCount = length;
            }
        }
        return ++maxCount;
    }

    private int countSpaces(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
