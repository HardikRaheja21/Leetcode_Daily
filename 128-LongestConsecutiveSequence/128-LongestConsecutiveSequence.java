// Last updated: 2/10/2026, 3:18:58 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for (int num : nums) st.add(num);

        int maxStreak = 0;

        for (int num : st) {
            if (!st.contains(num - 1)) {  // Start of a sequence
                int currNum = num;
                int currStreak = 1;

                while (st.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }

                maxStreak = Math.max(maxStreak, currStreak);
            }
        }

        return maxStreak;
    }
}
