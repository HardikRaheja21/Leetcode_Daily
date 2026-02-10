// Last updated: 2/10/2026, 3:20:34 PM
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> symbval = new HashMap<>();
        symbval.put('I', 1);
        symbval.put('V', 5);
        symbval.put('X', 10);
        symbval.put('L', 50);
        symbval.put('C', 100);
        symbval.put('D', 500);
        symbval.put('M', 1000);

        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            if(i < s.length() - 1 && symbval.get(s.charAt(i)) < symbval.get(s.charAt(i + 1))) sum -= symbval.get(s.charAt(i));
            else sum += symbval.get(s.charAt(i));
        }
        return sum;
    }
}