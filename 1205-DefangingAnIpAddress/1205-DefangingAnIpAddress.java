// Last updated: 2/10/2026, 3:15:24 PM
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < address.length(); i++){
            char c = address.charAt(i);

            if(c == '.'){
                ans.append("[.]");
            }
            else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}