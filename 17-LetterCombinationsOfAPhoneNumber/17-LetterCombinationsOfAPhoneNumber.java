// Last updated: 2/10/2026, 3:20:29 PM
class Solution {
    private static final String[] MAP = {
        "", "", "abc", "def",
        "ghi", "jkl", "mno",
        "pqrs", "tuv", "wxyz"
    };
    private void makeComabinations(int idx, StringBuilder sb, List<String> ans, String digits){
        if(idx == digits.length()){
            ans.add(sb.toString());
            return;
        }
        String letters = MAP[digits.charAt(idx) - '0'];
        for(char ch : letters.toCharArray()){
            sb.append(ch);
            makeComabinations(idx + 1, sb, ans, digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.length() == 0) return ans;
        makeComabinations(0, new StringBuilder(), ans, digits);
        return ans;
    }
}