// Last updated: 2/10/2026, 3:11:41 PM
class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            hs.put(ch, i);
        }
        HashMap<Character, Integer> ht = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            ht.put(ch, i);
        }
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            sum += Math.abs(hs.get(ch) - ht.get(ch)); 
        }
        return sum;
    }
}