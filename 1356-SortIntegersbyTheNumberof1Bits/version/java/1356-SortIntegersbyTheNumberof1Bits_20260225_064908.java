// Last updated: 2/25/2026, 6:49:08 AM
1class Solution {
2    public int[] sortByBits(int[] arr) {
3        List<Integer> list = new ArrayList<>();
4        for (int num : arr) {
5            list.add(num);
6        }
7        Collections.sort(list, (x , y) -> {
8            int tempX = x;
9            int tempY = y;
10            int countX = 0;
11            int countY = 0;
12
13            while(tempX != 0){
14                countX += (tempX & 1);
15                tempX >>>= 1;
16            }
17            while(tempY != 0){
18                countY += (tempY & 1);
19                tempY >>>= 1;
20            }
21            return (countX != countY) ? countX - countY : x-y;
22        });
23
24        int[] res = new int[arr.length];
25        int i = 0;
26        for(int e : list){
27            res[i++] = e;
28        }
29        return res;
30    }
31}