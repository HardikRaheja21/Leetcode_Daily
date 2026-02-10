// Last updated: 2/10/2026, 3:16:26 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(letters[mid] <= target){
                low = mid + 1;
            } else high = mid - 1;
        }
        return letters[low % letters.length];
    }
}