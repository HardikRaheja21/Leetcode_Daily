// Last updated: 3/23/2026, 5:29:26 PM
class Tuple{
    int row;
    int col;
    int time;

    public Tuple(int row, int col, int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;

        boolean[][] vis = new boolean[n][m];

        PriorityQueue<Tuple> pq =
            new PriorityQueue<>((a,b) -> a.time - b.time);

        pq.add(new Tuple(0,0,0));

        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,-1,0,1};

        while(!pq.isEmpty()){
            Tuple tup = pq.poll();

            int r = tup.row;
            int c = tup.col;
            int time = tup.time;

            if(vis[r][c]) continue;
            vis[r][c] = true;

            if(r == n-1 && c == m-1)
                return time;

            for(int i=0;i<4;i++){
                int nr = r + delRow[i];
                int nc = c + delCol[i];

                if(nr>=0 && nc>=0 && nr<n && nc<m && !vis[nr][nc]){
                    int newTime =
                        Math.max(time, moveTime[nr][nc]) + 1;

                    pq.add(new Tuple(nr,nc,newTime));
                }
            }
        }

        return -1;
    }
}