// Last updated: 2/10/2026, 3:16:19 PM
class Solution {
    private void makeCombinations(int idx, char[] chars, List<String> ans){
        if(idx == chars.length){
            ans.add(new String(chars));
            return;
        }
        if(Character.isDigit(chars[idx])){
            makeCombinations(idx + 1, chars, ans);
        } else {
            chars[idx] = Character.toLowerCase(chars[idx]);
            makeCombinations(idx + 1, chars, ans);

            chars[idx] = Character.toUpperCase(chars[idx]);
            makeCombinations(idx + 1, chars, ans);
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        makeCombinations(0, s.toCharArray(), ans);
        return ans;
    }
}