// Last updated: 2/10/2026, 3:13:29 PM
class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> groups = new ArrayList<>();
        int n = s.length();
        
        // Loop through the string in steps of k
        for (int i = 0; i < n; i += k) {
            // Get the substring of size k or remaining characters
            if (i + k <= n) {
                groups.add(s.substring(i, i + k));
            } else {
                StringBuilder lastGroup = new StringBuilder(s.substring(i));
                // Add fill characters to complete the group
                while (lastGroup.length() < k) {
                    lastGroup.append(fill);
                }
                groups.add(lastGroup.toString());
            }
        }
        
        // Convert the list to an array and return
        return groups.toArray(new String[0]);
    }
}