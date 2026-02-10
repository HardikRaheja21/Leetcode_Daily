// Last updated: 2/10/2026, 3:17:30 PM
class Solution {
    public void reverseString(char[] s) {
        int a = 1;
        for(int i = 0; i < s.length/2; i++){
            char temp = s[i];
            s[i] = s[s.length - a];
            s[s.length - a] = temp;
            a++;
        }
    }
}