// Last updated: 2/10/2026, 3:20:44 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> visited = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            while(visited.contains(s.charAt(i))){
                visited.remove(s.charAt(left));
                left++;
            }
            visited.add(s.charAt(i));
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}