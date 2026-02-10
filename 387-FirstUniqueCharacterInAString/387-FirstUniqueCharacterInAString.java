// Last updated: 2/10/2026, 3:17:22 PM
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(freq.get(c) == 1) return i;
        }
        return -1;
    }
}