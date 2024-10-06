public class L495_TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalTime = duration;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i] + duration < timeSeries[i + 1]) {
                totalTime += duration;
            } else {
                totalTime += timeSeries[i + 1] - timeSeries[i];
            }
        }
        return totalTime;
    }

    public static void main(String[] args) {
        L495_TeemoAttacking l495TeemoAttacking = new L495_TeemoAttacking();
        System.out.println(l495TeemoAttacking.findPoisonedDuration(new int[]{1,2}, 2));
    }
}
