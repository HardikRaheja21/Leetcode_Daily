// Last updated: 2/10/2026, 3:10:01 PM
class Solution {
    public long removeZeros(long n) {
        String res = "";
        for(char ch : String.valueOf(n).toCharArray()){
            if(ch != '0') res += ch;
        }
        return Long.parseLong(res);
    }
}