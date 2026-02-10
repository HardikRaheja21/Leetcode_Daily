// Last updated: 2/10/2026, 3:10:17 PM
class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer, Integer> freq = new HashMap<>();
        int num = n;
        while(num > 0){
            int digit = num % 10;
            freq.put(digit, freq.getOrDefault(digit, 0) + 1);
            num = num / 10;
        }
        int leastfreq = 0;
        int leastfreqval = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() == leastfreqval){
                leastfreq = Math.min(entry.getKey(), leastfreq);
            } else if(entry.getValue() < leastfreqval){
                leastfreq = entry.getKey();
                leastfreqval = entry.getValue();
            }
        }
        return leastfreq;
    }
}