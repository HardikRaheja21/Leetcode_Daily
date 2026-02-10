// Last updated: 2/10/2026, 3:19:52 PM
class Solution {
    public int lengthOfLastWord(String s) {
        // Trim trailing spaces
        s = s.trim();
        
        // Start from the end of the string
        int length = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            // Stop when a space is found
            if(s.charAt(i) == ' '){
                break;
            }
            length++;
        }
        return length;
    }
}