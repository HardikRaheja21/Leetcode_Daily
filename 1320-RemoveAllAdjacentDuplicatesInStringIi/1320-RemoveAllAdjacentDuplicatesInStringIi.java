// Last updated: 2/10/2026, 3:15:08 PM
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();
        String result = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!(st.isEmpty()) && (st.peek()[0] == ch)){
                st.peek()[1]++;
                if(st.peek()[1] == k) st.pop();
            } else {
                st.push(new int[]{ch, 1});
            }
        }
        while(!st.isEmpty()){
            int[] top = st.pop();
            char ch = (char) top[0];
            int freq = top[1];
            for(int i = 0; i < freq; i++) result += ch;
        }
        String ans = new StringBuilder(result).reverse().toString();
        return ans;
    }
}