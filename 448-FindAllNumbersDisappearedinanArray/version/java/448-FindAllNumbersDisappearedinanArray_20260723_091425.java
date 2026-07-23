// Last updated: 7/23/2026, 9:14:25 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> result = new ArrayList<>();
4        HashMap<Integer, Integer> hs = new HashMap<>();
5        for(int i = 1; i <= nums.length; i++){
6            hs.put(i, 1);
7        }
8        for(int i = 0; i < nums.length; i++){
9            hs.put(nums[i], hs.get(nums[i]) + 1);
10        }
11        for(Integer key : hs.keySet()){
12            if(hs.get(key) == 1){
13                result.add(key);
14            }
15        }
16        return result;
17    }
18}