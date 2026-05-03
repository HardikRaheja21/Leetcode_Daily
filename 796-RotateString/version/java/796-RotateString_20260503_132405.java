// Last updated: 5/3/2026, 1:24:05 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        // Check if lengths are the same; if not, they can't be rotations of each other
4        if (s.length() != goal.length()) {
5            return false;
6        }
7        
8        // Concatenate s with itself
9        String doubled = s + s;
10        
11        // Check if goal is a substring of the concatenated string
12        return doubled.contains(goal);
13    }
14}