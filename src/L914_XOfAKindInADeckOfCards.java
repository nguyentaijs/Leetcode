import java.util.HashMap;
import java.util.Map;

public class L914_XOfAKindInADeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < deck.length; i++) {
            if (map.containsKey(deck[i])) {
                map.put(deck[i], map.get(deck[i]) + 1);
            } else {
                map.put(deck[i], 1);
            }
        }

        int gdcValue = -1;
        for (int value : map.values()) {
            if (gdcValue == -1) {
                gdcValue = value;
            } else {
                gdcValue = gdc(gdcValue, value);
            }
        }

        return gdcValue >= 2;
    }

    private int gdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gdc(b, a%b);
    }

    public static void main(String[] args) {
        L914_XOfAKindInADeckOfCards l914 = new L914_XOfAKindInADeckOfCards();
        System.out.println(l914.hasGroupsSizeX(new int[]{1,1}));
    }
}
