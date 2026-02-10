// Last updated: 2/10/2026, 3:20:23 PM
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()){
            return 0;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();
        // Iterate over haystack from index 0 to haystackLength - needleLength
        for(int i = 0; i <= haystackLength -needleLength; i++){
            // Extract the substring of haystack from i to i + needleLength
            if(haystack.substring(i, i + needleLength).equals(needle)){
                return i;
            }
        }    
        // If no match is found, return -1
        return -1;
    }
}