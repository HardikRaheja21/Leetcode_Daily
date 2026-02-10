// Last updated: 2/10/2026, 3:15:28 PM
class Solution {
    public String removeDuplicates(String s) {
        String result = "";
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!(st.isEmpty()) && (st.peek() == ch)) st.pop();
            else st.push(ch);
        }
        while(!st.isEmpty()) result += st.pop();
        String ans = new StringBuilder(result).reverse().toString();
        return ans;
    }
}