// Last updated: 2/10/2026, 3:09:52 PM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> vals = new HashSet<>();
        for(int num : nums){
            vals.add(num);
        }
        int kmultiple = k;
        while(true){
            if(!vals.contains(kmultiple)) {
                return kmultiple;
            }
            kmultiple += k; 
        }
    }
}