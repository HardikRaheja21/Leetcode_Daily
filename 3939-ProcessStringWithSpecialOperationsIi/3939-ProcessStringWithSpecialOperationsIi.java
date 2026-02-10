// Last updated: 2/10/2026, 3:10:43 PM
class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        List<Long> lengths = new ArrayList<>(n);
        long currlen  = 0;

        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)) currlen++;
            else if(ch == '*'){
                if(currlen > 0) currlen--;
            } else if(ch == '#'){
                currlen = Math.min(currlen * 2, (long) 1e15 + 1);
            } else if(ch == '%'){}
            lengths.add(currlen);
        }
        if(k >= currlen) return '.';

        for(int i = n - 1; i >= 0; i--){
            char ch = s.charAt(i);
            long prevlen = (i == 0) ? 0 :  lengths.get(i - 1);
            long curr = lengths.get(i);
            if(ch == '*'){
                if(prevlen < curr) k++;
            } else if(ch == '#'){
                if(k >= prevlen){
                    k -= prevlen;
                }
            } else if(ch == '%'){
                k = curr - 1 - k;
            } else {
                if(curr - prevlen == 1){
                    if(k == curr - 1){
                        return ch;
                    } else curr--;
                }
            }
        }
        return '.';
    }
}