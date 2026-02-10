// Last updated: 2/10/2026, 3:13:53 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        int valu = freq.get(s.charAt(0));
        for(Integer value : freq.values()){
            if(value != valu) return false;
        }
        return true;
    }
}