// Last updated: 2/10/2026, 3:10:49 PM
class Solution {
    public String processStr(String s) {
        String result = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(!result.isEmpty()){
                    result = result.substring(0, result.length() - 1);
                }
            } else if(ch == '#'){
                result = result + result;
            } else if(ch == '%'){
                String reversed = new StringBuilder(result).reverse().toString();
                result = reversed;
            } else {
                result += ch;
            }
        }
        return result;
    }
}