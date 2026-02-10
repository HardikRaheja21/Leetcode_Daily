// Last updated: 2/10/2026, 3:11:55 PM
class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int minLen = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        int i = 0;
        while(i < minLen && s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) i++;
        if(i == 0) return -1;
        return (s1.length() - i) + (s2.length() - i) + (s3.length() - i);
    }
}