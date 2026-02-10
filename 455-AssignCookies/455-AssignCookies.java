// Last updated: 2/10/2026, 3:17:03 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int l = 0, r = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l < s.length && r < g.length){
            if(g[r] <= s[l]) r = r + 1;
            l = l + 1;
        }
        return r;
    }
}