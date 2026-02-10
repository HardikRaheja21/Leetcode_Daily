// Last updated: 2/10/2026, 3:16:22 PM
class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastOcurrences = new int[26];
        for(int i = 0; i < s.length(); i++){
            lastOcurrences[s.charAt(i) - 'a'] = i;
        }
        List<Integer> ans = new ArrayList<>();
        int partitionStart = 0;
        int partitionEnd = 0;
        for(int i = 0; i < s.length(); i++){
            partitionEnd = Math.max(partitionEnd, lastOcurrences[s.charAt(i) - 'a']);
            if(i == partitionEnd){
                ans.add(partitionEnd - partitionStart + 1);
                partitionStart = i + 1;
            }
        }
        return ans;
    }
}