// Last updated: 4/1/2026, 5:29:54 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4        int n = s.length();
5        for(int i = 0; i < n; i++){
6            char ch = s.charAt(i);
7            if(ch == '(' || ch == '{' || ch == '['){
8                st.push(ch);
9            } else {
10                if(st.size() == 0) return false;
11                char top = st.pop();
12                if ((ch == ')' && top != '(') ||
13                    (ch == '}' && top != '{') ||
14                    (ch == ']' && top != '[')) {
15                    return false;
16                }
17            }
18        }
19        return st.isEmpty();
20    }
21}