// Last updated: 2/10/2026, 3:18:16 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character sCH = s.charAt(i);
            Character tCH = t.charAt(i);

            if(mp.containsKey(sCH)){
                if(mp.get(sCH) != tCH) return false;
            } else if(mp.containsValue(tCH)) {
                return false;
            } else {
                mp.put(sCH, tCH);
            }
        }
        return true;
    }
}