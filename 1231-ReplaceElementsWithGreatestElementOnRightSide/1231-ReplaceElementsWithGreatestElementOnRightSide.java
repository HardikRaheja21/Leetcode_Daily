// Last updated: 2/10/2026, 3:15:22 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;

        for(int i = n - 1; i >= 0; i--){
            int current = arr[i];
            arr[i] = max;
            max = Math.max(max, current);
        }
        return arr;
    }
}