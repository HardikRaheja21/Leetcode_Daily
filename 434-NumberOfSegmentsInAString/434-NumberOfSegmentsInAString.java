// Last updated: 2/10/2026, 3:17:11 PM
class Solution {
    public int countSegments(String s) {
        // Trim the string and split it by spaces
        String[] segments = s.trim().split("\\s+");

        // If the string is empty after trimming, return 0
        if(s.trim().isEmpty()){
            return 0;
        }

        // Return the length of the array, which gives the count of segments
        return segments.length;
    }
}