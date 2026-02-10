// Last updated: 2/10/2026, 3:15:57 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, right = 0, maxLen = 0, k = 2;
        Map<Integer, Integer> freq = new HashMap<>();
        while(right < fruits.length){
            freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);
            if(freq.size() > k){
                while(freq.size() > k){
                    freq.put(fruits[left], freq.getOrDefault(fruits[left], 0) - 1);
                    if(freq.get(fruits[left]) == 0){
                        freq.remove(fruits[left]);
                    }
                    left++;
                }
            }
            if(freq.size() <= k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }
}