// Last updated: 2/10/2026, 3:17:07 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(hs.containsKey(nums[i])){
                hs.put(nums[i], hs.get(nums[i] + 1));
                if(!duplicates.contains(nums[i])){
                    duplicates.add(nums[i]);
                }
            } else {
                hs.put(nums[i], 1);
            }
        }
        return duplicates;
    }
}