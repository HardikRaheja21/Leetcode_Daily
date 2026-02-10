// Last updated: 2/10/2026, 3:10:59 PM
class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        int vowelFreq = 0;
        int consonantFreq = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(hs.containsKey(ch)){
                hs.put(ch, hs.get(ch) + 1);
            } else {
                hs.put(ch, 1);
            }
        }

        for(char ch : hs.keySet()){
            int freq = hs.get(ch);
            if("aeiou".indexOf(ch) >= 0){
                vowelFreq = Math.max(vowelFreq, freq);
            } else {
                consonantFreq = Math.max(consonantFreq, freq);
            }
        }
        return vowelFreq + consonantFreq;
    }
}