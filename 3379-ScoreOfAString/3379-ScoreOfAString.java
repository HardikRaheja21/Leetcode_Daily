// Last updated: 2/10/2026, 3:11:44 PM
class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int ascii = (int) s.charAt(i);
            int ascii2 = (int) s.charAt(i + 1);
            score += Math.abs(ascii - ascii2);
        }
        return score;
    }
}