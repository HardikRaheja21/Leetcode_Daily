// Last updated: 3/4/2026, 8:12:23 AM
1class Solution {
2    public int numSpecial(int[][] mat) {
3        int[] rowOnes = new int[mat.length];
4        int[] colOnes = new int[mat[0].length];
5        for(int i = 0; i < mat.length; i++){
6            for(int j = 0; j < mat[0].length; j++){
7                if(mat[i][j] == 1) rowOnes[i]++;
8            }
9        }
10        for(int j = 0; j < mat[0].length; j++){
11            for(int i = 0; i < mat.length; i++){
12                if(mat[i][j] == 1) colOnes[j]++;
13            }
14        }
15        int ans = 0;
16        for(int i = 0; i < mat.length; i++){
17            for(int j = 0; j < mat[0].length; j++){
18                if(mat[i][j] == 1 && rowOnes[i] == 1 && colOnes[j] == 1) ans++;
19            }
20        }
21        return ans;
22    }
23}