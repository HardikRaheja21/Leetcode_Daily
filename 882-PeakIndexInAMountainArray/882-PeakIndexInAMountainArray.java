// Last updated: 2/10/2026, 3:16:06 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 1, high = arr.length - 2;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
            else if(arr[mid] < arr[mid + 1]) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}