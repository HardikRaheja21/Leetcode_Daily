// Last updated: 2/10/2026, 3:12:17 PM
class Solution {
    public boolean isFascinating(int n) {
        int[] freq = new int[10];
        String s = "" + n + 2 * n + 3 * n;
        if(s.length() != 9) return false;
        for(char ch : s.toCharArray()){
            int digit = ch - '0';
            if(digit == 0) return false;
            freq[digit]++;
            if(freq[digit] > 1) return false;
        }
        return true;
    }
}