// Last updated: 2/10/2026, 3:14:18 PM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<>();
        for(char ch : allowed.toCharArray()){
            hs.add(ch);
        }
        int count = 0;
        for(String word : words){
            boolean isConsistent = true;
            for(char ch : word.toCharArray()){
                if(!hs.contains(ch)){
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent) count++;
        }
        return count;
    }
}