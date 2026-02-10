// Last updated: 2/10/2026, 3:11:57 PM
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1 = 0;
        int count2 = 0;
        int[] result = new int[2];
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int num : nums1){
            hs1.add(num);
        }
        for(int num : nums2){
            hs2.add(num);
        }
        for(int num : nums1){
            if(hs2.contains(num)) count1++;
        }
        for(int num : nums2){
            if(hs1.contains(num)) count2++;
        }
        result[0] = count1;
        result[1] = count2;
        return result;
    }
}