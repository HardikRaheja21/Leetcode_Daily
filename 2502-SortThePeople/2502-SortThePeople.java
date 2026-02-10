// Last updated: 2/10/2026, 3:12:57 PM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[][] srt = new String[n][2];
        for(int i = 0; i < n; i++){
            srt[i][0] = names[i];
            srt[i][1] = String.valueOf(heights[i]);
        }
        Arrays.sort(srt, (a, b) -> Integer.parseInt(b[1]) - Integer.parseInt(a[1]));

        for(int i = 0; i < n; i++){
            names[i] = srt[i][0];
        }
        return names;
    }
}