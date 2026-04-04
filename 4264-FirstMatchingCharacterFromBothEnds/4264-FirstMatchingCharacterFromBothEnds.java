// Last updated: 4/4/2026, 12:46:55 PM
class Solution {
    public int firstMatchingIndex(String s) {
        int n = s.length();
        for(int i = 0; i < n / 2 + 1; i++){
            if(s.charAt(i) == s.charAt(n - i - 1)) return i;
        }
        return -1;
    }
}