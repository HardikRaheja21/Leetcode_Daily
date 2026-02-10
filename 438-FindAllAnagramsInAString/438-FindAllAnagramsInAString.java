// Last updated: 2/10/2026, 3:17:08 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int n = s.length(), m = p.length();
        if(m > n) return result;
        int[] need = new int[26];
        int[] window = new int[26];
        for(int i = 0; i < m; i++){
            need[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }
        if(matches(need, window)) result.add(0);
        int left = 0;
        for(int right = m; right < n; right++){
            window[s.charAt(right) - 'a']++;
            window[s.charAt(left) - 'a']--;
            if(matches(need, window)) result.add(left + 1);
            left++;
        }
        return result;
    }
    public boolean matches(int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}