// Last updated: 2/10/2026, 3:17:26 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        for(int num : nums1){
            hs1.add(num);
        }

        HashSet<Integer> hs2= new HashSet<>();
        for(int num : nums2){
            if(hs1.contains(num)){
                hs2.add(num);
            }
        }

        int[] result = new int[hs2.size()];
        int index = 0;
        for(int num : hs2){
            result[index++] = num;
        }
        return result;
    }
}