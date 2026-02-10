// Last updated: 2/10/2026, 3:17:20 PM
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < num.length(); i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && k > 0 && (st.peek() - '0') > (ch - '0')){
                st.pop();
                k = k - 1;
            } st.push(ch);
        }
        while(k > 0) {
            st.pop();
            k = k - 1;
        }
        if(st.isEmpty()) return "0";
        // build answer (stack -> reversed order)
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse(); // IMPORTANT

        // remove leading zeros
        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') idx++;

        String ans = sb.substring(idx);
        return ans.length() == 0 ? "0" : ans;
    }
}