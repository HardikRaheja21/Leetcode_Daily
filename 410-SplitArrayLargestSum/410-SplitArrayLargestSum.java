// Last updated: 2/10/2026, 3:17:18 PM
class Solution {
    public int countArrays(int[] arr, int partitions){
        int arrays = 1;
        long partitionArrays = 0;
        for(int i = 0; i < arr.length; i++){
            if(partitionArrays + arr[i] <= partitions){    
                partitionArrays += arr[i];
            } else {
                arrays += 1;
                partitionArrays = arr[i];
            }
        }
        return arrays;
    }
    public int findArrays(int[] arr, int m){
        if(m > arr.length) return -1;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i < arr.length; i++){
            low = Math.max(low, arr[i]);
            high += arr[i];
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            int arrays = countArrays(arr, mid);
            if(arrays > m) low = mid + 1;
            else high =mid - 1;
        }
        return low;
    }
    public int splitArray(int[] nums, int k) {
        return findArrays(nums, k);
    }
}