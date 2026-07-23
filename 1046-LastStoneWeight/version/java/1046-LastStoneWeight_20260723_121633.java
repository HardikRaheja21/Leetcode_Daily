// Last updated: 7/23/2026, 12:16:33 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        //Create a max-heap using a priority queue
4        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
5
6        //Add all stones to the max-heap
7        for(int stone : stones){
8            maxHeap.add(stone);
9        }
10
11        //Smash the two heaviest stons until one or zero stones remain
12        while(maxHeap.size() > 1){
13            //Get the two heaviest stones
14            int stone1 = maxHeap.poll();
15            int stone2 = maxHeap.poll();
16
17            //If the stone are not equal, put the difference back into the heap
18            if(stone1 != stone2){
19                maxHeap.add(stone1 - stone2);
20            } 
21        }
22        //If there is one stone left, return its weight, otherwise return 0
23        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
24    }
25}