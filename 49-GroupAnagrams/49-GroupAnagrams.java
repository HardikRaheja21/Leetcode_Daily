// Last updated: 2/10/2026, 3:20:04 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Set<String> alreadyAnagram = new HashSet<>(); 
        for(int i = 0; i < strs.length; i++){
            String s = strs[i];
            List<String> group = new ArrayList<>();
            if(!alreadyAnagram.contains(s)){
                group.add(s);
                for(int j = i + 1; j < strs.length; j++){
                    String t = strs[j];
                    if(isAnagram(s, t)){
                        group.add(t);
                        alreadyAnagram.add(t);
                    }
                }
            }
            if(!group.isEmpty()){
                result.add(group);      
            }      
        }
        return result;
    }
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            freq[ch - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0) return false;
        }
        return true;
    }
}