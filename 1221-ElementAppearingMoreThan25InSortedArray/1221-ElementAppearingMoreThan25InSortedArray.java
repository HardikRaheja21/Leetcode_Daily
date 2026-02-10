// Last updated: 2/10/2026, 3:15:23 PM
class Solution {
    public int findSpecialInteger(int[] arr) {
        int size = arr.length / 4;
        for (int i = 0; i < arr.length - size; i++) {
            if (arr[i] == arr[i + size]) {
                return arr[i];
            }
        }
        
        return -1;
    }
}