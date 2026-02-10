// Last updated: 2/10/2026, 3:12:46 PM
class Solution {
    public int maximumValue(String[] strs) {
        int maxValue = 0;

        for(String str : strs){
            int value;

            if(str.matches("\\d+")){
                value = Integer.parseInt(str);
            }
            else {
                value = str.length();
            }
            
            maxValue = Math.max(maxValue, value);
        }
        return maxValue;
    }
}