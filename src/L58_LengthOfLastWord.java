public class L58_LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        // regex -> last word
        s = s.replaceAll("\\s+$", "");
        if (s.length() == 1) {
            return 1;
        }
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                return count;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "day";
        System.out.println(lengthOfLastWord(s));

    }
}
