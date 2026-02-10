// Last updated: 2/10/2026, 3:16:09 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return stringAfterOperation(s).equals(stringAfterOperation(t));
    }
    public String stringAfterOperation(String s){
        Stack<Character> st = new Stack<>();
        String result = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '#') {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(ch);
            }
        }
        while(!st.isEmpty()) result += st.pop();
        return new StringBuilder(result).reverse().toString();
    }
}