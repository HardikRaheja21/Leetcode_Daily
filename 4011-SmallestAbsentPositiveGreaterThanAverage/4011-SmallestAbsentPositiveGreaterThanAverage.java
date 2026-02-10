// Last updated: 2/10/2026, 3:10:09 PM
import java.util.*;

class Solution {
    public int smallestAbsent(int[] nums) {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double average = sum / nums.length;

        Set<Integer> positives = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                positives.add(num);
            }
        }

        int smallest = Math.max(1, (int)Math.floor(average) + 1);
        while (true) {
            if (!positives.contains(smallest)) {
                return smallest;
            }
            smallest++;
        }
    }
}
