// Last updated: 4/4/2026, 12:46:52 PM
class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = 0, even = 0;
        for(int num : nums1){
            if(num % 2 == 0) even++;
            else odd++;
        }
        if(odd >= 1) return true;
        if(odd != 1) return true;
        return false;
    }
}