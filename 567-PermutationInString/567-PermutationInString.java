// Last updated: 2/10/2026, 3:16:44 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if(n > m) return false;
        int[] need = new int[26];
        int[] window = new int[26];
        for(int i = 0; i < n; i++){
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }
        if(matches(need, window)) return true;
        int left = 0;
        for(int right = n; right < m; right++){
            window[s2.charAt(right) - 'a']++;
            window[s2.charAt(left) - 'a']--;
            if(matches(need, window)) return true;
            left++;
        }
        return false;
    }
    public boolean matches(int[] need, int[] window){
        for(int i = 0; i < need.length; i++){
            if(need[i] != window[i])  return false;
        }
        return true;
    }
}