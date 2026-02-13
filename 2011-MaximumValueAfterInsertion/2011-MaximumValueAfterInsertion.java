// Last updated: 2/13/2026, 7:39:17 AM
class Solution {
    public String maxValue(String n, int x) {
        boolean isNegative = n.charAt(0) == '-';
        StringBuilder sb = new StringBuilder();
        if(isNegative) sb.append('-');
        for(int i = isNegative ? 1 : 0; i < n.length(); i++){
            int digit = n.charAt(i) - '0';
            if((!isNegative && digit < x) || (isNegative && digit > x)){
                sb.append(x);
                sb.append(n.substring(i));
                return sb.toString();
            }
            sb.append(digit);
        }
        sb.append(x);
        return sb.toString();
    }
}