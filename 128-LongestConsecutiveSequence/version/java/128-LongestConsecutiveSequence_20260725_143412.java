// Last updated: 7/25/2026, 2:34:12 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> st = new HashSet<>();
4        for (int num : nums) st.add(num);
5
6        int maxStreak = 0;
7
8        for (int num : st) {
9            if (!st.contains(num - 1)) {  // Start of a sequence
10                int currNum = num;
11                int currStreak = 1;
12
13                while (st.contains(currNum + 1)) {
14                    currNum++;
15                    currStreak++;
16                }
17
18                maxStreak = Math.max(maxStreak, currStreak);
19            }
20        }
21
22        return maxStreak;
23    }
24}
25