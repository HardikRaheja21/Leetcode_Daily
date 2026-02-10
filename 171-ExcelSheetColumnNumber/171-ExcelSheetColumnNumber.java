// Last updated: 2/10/2026, 3:18:28 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for(int i = 0; i < columnTitle.length(); i++){
            char currentChar = columnTitle.charAt(i);
            int value = currentChar - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}