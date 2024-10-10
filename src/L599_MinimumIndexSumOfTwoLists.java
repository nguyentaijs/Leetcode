import java.util.*;

public class L599_MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                result.put(list2[i], map.get(list2[i]) + i);
            }
        }
        int min = Integer.MAX_VALUE;
        for(Integer value : result.values()) {
            min = Math.min(min, value);
        }
        List<String> finalArray = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : result.entrySet()) {
            if (min == entry.getValue()) {
                finalArray.add(entry.getKey());
            }
        }
        return finalArray.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};

        L599_MinimumIndexSumOfTwoLists solution = new L599_MinimumIndexSumOfTwoLists();
        String[] result = solution.findRestaurant(list1, list2);
        System.out.println(Arrays.toString(result)); // Output: [Shogun]

    }
}
