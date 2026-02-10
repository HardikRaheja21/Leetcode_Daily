// Last updated: 2/10/2026, 3:13:01 PM
class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        String result = "";
        for(char ch : s.toCharArray()){
            if(!(st.isEmpty()) && ch == '*') st.pop();
            else st.push(ch);
        }
        while(!st.isEmpty()) result += st.pop();
        return new StringBuilder(result).reverse().toString();
    }
}