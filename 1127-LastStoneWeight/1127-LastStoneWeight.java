// Last updated: 2/10/2026, 3:15:30 PM
class Solution {
    public int lastStoneWeight(int[] stones) {
        //Create a max-heap using a priority queue
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        //Add all stones to the max-heap
        for(int stone : stones){
            maxHeap.add(stone);
        }

        //Smash the two heaviest stons until one or zero stones remain
        while(maxHeap.size() > 1){
            //Get the two heaviest stones
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            //If the stone are not equal, put the difference back into the heap
            if(stone1 != stone2){
                maxHeap.add(stone1 - stone2);
            } 
        }
        //If there is one stone left, return its weight, otherwise return 0
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}