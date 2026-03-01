// Last updated: 3/1/2026, 1:59:51 PM
1class Solution {
2    public int[] minDistinctFreqPair(int[] nums) {
3        int[] freq = new int[101];
4        for(int i = 0; i < nums.length; i++){
5            freq[nums[i]]++;
6        }
7        for(int x = 0; x < 101; x++){
8            if(freq[x] == 0) continue;
9            for(int y = x + 1; y < 101; y++){
10                if(freq[y] == 0) continue;
11                if(freq[x] == freq[y]) continue;
12                else if(freq[x] != freq[y]) return new int[]{x, y};
13            }
14        }
15        return new int[]{-1, -1};
16    }
17}