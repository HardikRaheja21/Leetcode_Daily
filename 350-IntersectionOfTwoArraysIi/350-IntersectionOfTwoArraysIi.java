// Last updated: 2/10/2026, 3:17:25 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        //Count ocurrences of each number in nums1
        for(int num : nums1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //Check for each number in nums2
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                result.add(num);    //Add to result
                map.put(num, map.get(num) - 1);  //Decrement count
            }
        }

        //Count ArrayList to int array
        int[] intersection = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            intersection[i] = result.get(i);
        }
        return intersection;
    }
}