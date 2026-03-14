// Last updated: 3/14/2026, 12:06:59 PM
1class Tuple{
2    int row;
3    int col;
4    int time;
5
6    public Tuple(int row, int col, int time){
7        this.row = row;
8        this.col = col;
9        this.time = time;
10    }
11}
12
13class Solution {
14    public int minTimeToReach(int[][] moveTime) {
15        int n = moveTime.length;
16        int m = moveTime[0].length;
17
18        boolean[][] vis = new boolean[n][m];
19
20        PriorityQueue<Tuple> pq =
21            new PriorityQueue<>((a,b) -> a.time - b.time);
22
23        pq.add(new Tuple(0,0,0));
24
25        int[] delRow = {-1,0,1,0};
26        int[] delCol = {0,-1,0,1};
27
28        while(!pq.isEmpty()){
29            Tuple tup = pq.poll();
30
31            int r = tup.row;
32            int c = tup.col;
33            int time = tup.time;
34
35            if(vis[r][c]) continue;
36            vis[r][c] = true;
37
38            if(r == n-1 && c == m-1)
39                return time;
40
41            for(int i=0;i<4;i++){
42                int nr = r + delRow[i];
43                int nc = c + delCol[i];
44
45                if(nr>=0 && nc>=0 && nr<n && nc<m && !vis[nr][nc]){
46                    int newTime =
47                        Math.max(time, moveTime[nr][nc]) + 1;
48
49                    pq.add(new Tuple(nr,nc,newTime));
50                }
51            }
52        }
53
54        return -1;
55    }
56}