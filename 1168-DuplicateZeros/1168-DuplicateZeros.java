// Last updated: 2/10/2026, 3:15:26 PM
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        for(int num : arr){
            if(num == 0) zeros++;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i + zeros < n) {
                arr[i + zeros] = arr[i];
            }

            if (arr[i] == 0) {
                zeros--; // Decrement the count of zeros
                if (i + zeros < n) {
                    arr[i + zeros] = 0; // Duplicate the zero
                }
            }
        }
    }
}