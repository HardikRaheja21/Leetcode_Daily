// Last updated: 2/10/2026, 3:18:32 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            char currentchar = (char) (columnNumber % 26 + 'A');
            result.insert(0, currentchar);
            columnNumber /= 26;
        }
        return result.toString();
    }
}