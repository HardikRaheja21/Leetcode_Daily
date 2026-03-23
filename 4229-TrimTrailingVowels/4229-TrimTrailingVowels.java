// Last updated: 3/23/2026, 5:28:26 PM
class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = sb.length() - 1; i >= 0; i--){
            char ch = sb.charAt(i);
            if(!isVowel(ch)) break;
            if(isVowel(ch)) sb.deleteCharAt(i);
        }
        return sb.toString();
    }
    private boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
}