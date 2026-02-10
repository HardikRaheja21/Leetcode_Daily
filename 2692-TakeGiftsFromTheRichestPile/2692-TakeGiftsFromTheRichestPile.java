// Last updated: 2/10/2026, 3:12:28 PM
class Solution {
    public long pickGifts(int[] gifts, int k) {
        // Create a max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add all gifts to the max-heap
        for (int val : gifts) {
            maxHeap.add(val);
        }

        // Perform k seconds of gift picking
        for (int i = 0; i < k; i++) {
            int x = maxHeap.poll();  // Get the pile with the max number of gifts
            maxHeap.add((int) Math.sqrt(x));  // Replace it with the floor of the square root
        }

        // Calculate the sum of remaining gifts
        long sum = 0;
        while (!maxHeap.isEmpty()) {
            sum += maxHeap.poll();
        }

        return sum;
    }
}