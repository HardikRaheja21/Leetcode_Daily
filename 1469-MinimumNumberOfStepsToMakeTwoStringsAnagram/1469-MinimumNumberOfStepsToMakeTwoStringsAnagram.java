// Last updated: 2/10/2026, 3:14:54 PM
class Solution {
    public int minSteps(String s, String t) {
        int minSteps = 0;
        int[] count = new int[26];
        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            count[ch - 'a']--;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] > 0){
                minSteps += count[i];
            }
        }
        return minSteps;
    }
}