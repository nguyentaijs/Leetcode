public class L28_FindTheIndexOfTheFirstOccurrenceInString {
    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        char[] hayStacks = haystack.toCharArray();
        char[] needles = needle.toCharArray();
        int maxIteration = haystack.length() - needle.length() + 1;

        for (int i = 0; i < maxIteration; i++) {
            if (hayStacks[i] == needles[0]) {
                // Check again with others
                if (needles.length == 1) {
                    return i;
                }

                for (int j = 1; j < needles.length; j++) {
                    if (hayStacks[i + j] != needles[j]) {
                        break;
                    }
                    if (j == needles.length - 1) {
                        return i;
                    }
                }
            }
        }
        return -1;    }

    public static void main(String[] args) {
        int i = strStr("ablllbcllllll2abc123123", "abc");
        System.out.println(i == -1 ? "NOT FOUND" : i);

    }
}
