// Last updated: 2/10/2026, 3:11:04 PM
class Solution {
    public boolean isSorted(ArrayList<Integer> list){
        for(int i = 1; i < list.size(); i++){
            if(list.get(i - 1) > list.get(i)) return false;
        }
        return true;
    }
    public int minSumIndex(ArrayList<Integer> list){
        int idx = 0, bestSum = 0;
        bestSum = list.get(0) + list.get(1);
        for(int i = 1; i < list.size() - 1; i++){
            int sum = list.get(i) + list.get(i + 1);
            if(sum < bestSum){
                bestSum = sum;
                idx = i;
            }
        }
        return idx;
    }
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) list.add(nums[i]);
        while(!isSorted(list)){
            int idx = minSumIndex(list);
            int sum = list.get(idx) + list.get(idx + 1);
            list.remove(idx);
            list.remove(idx);
            list.add(idx, sum);
            count++;
        }
        return count;
    }
}