// Last updated: 3/23/2026, 5:28:54 PM
class Solution {
    public String mergeCharacters(String s, int k) {
        String sl = s;
        StringBuilder sb = new StringBuilder(s);
        boolean merged = true;
        while(merged){
            merged = false;
            for(int i = 0; i < sb.length(); i++){
                for(int j = i + 1; j < sb.length(); j++){
                    if(sb.charAt(i) == sb.charAt(j) && j - i <= k){
                        sb.deleteCharAt(j);
                        merged = true;
                        break;
                    }
                }
                if(merged) break;
            }
        }
        return sb.toString();
    }
}