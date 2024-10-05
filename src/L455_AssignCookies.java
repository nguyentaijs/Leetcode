import java.util.Arrays;

public class L455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int curChild = 0;
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i] >= g[curChild]) {
                count++;
                curChild++;
            }
            if (count == g.length) {
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        L455_AssignCookies l455AssignCookies = new L455_AssignCookies();
        System.out.println(l455AssignCookies.findContentChildren(new int[]{10,9,8,7}, new int[]{5,6,7,8}));
    }
}
