// Last updated: 2/10/2026, 3:17:06 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 1; i <= nums.length; i++){
            hs.put(i, 1);
        }
        for(int i = 0; i < nums.length; i++){
            hs.put(nums[i], hs.get(nums[i]) + 1);
        }
        for(Integer key : hs.keySet()){
            if(hs.get(key) == 1){
                result.add(key);
            }
        }
        return result;
    }
}