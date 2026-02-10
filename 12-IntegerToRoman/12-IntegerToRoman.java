// Last updated: 2/10/2026, 3:20:35 PM
class Solution {
    public String intToRoman(int num) {
        String result = "";
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V","IV", "I"};
        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                result += romans[i];
                num -= values[i];
            }
        }
        return result;
    }
}