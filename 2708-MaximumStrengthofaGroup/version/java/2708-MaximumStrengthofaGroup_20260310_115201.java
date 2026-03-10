// Last updated: 3/10/2026, 11:52:01 AM
1class Solution {
2    public long maxStrength(int[] nums) {
3
4        long posProd = 1;
5        long negProd = 1;
6
7        ArrayList<Integer> negNums = new ArrayList<>();
8
9        for(int num : nums){
10            if(num > 0){
11                posProd *= num;
12            }
13            else if(num < 0){
14                negNums.add(num);
15            }
16        }
17
18        Collections.sort(negNums);
19
20        int size = negNums.size();
21        if(size % 2 != 0) size--;
22
23        for(int i = 0; i < size; i++){
24            negProd *= negNums.get(i);
25        }
26
27        if(size == 0 && posProd == 1){
28            return Arrays.stream(nums).max().getAsInt();
29        }
30
31        return posProd * negProd;
32    }
33}