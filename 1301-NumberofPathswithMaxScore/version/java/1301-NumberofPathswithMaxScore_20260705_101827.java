// Last updated: 7/5/2026, 10:18:27 AM
1class Solution
2{
3    int mod=1000000007;
4
5    public int[] pathsWithMaxScore(List<String> board)
6    {
7        int n=board.size();
8
9        int[][] score=new int[n][n];
10        int[][] count=new int[n][n];
11
12        for(int i=0;i<n;i++)
13            Arrays.fill(score[i],-1);
14
15        score[n-1][n-1]=0;
16        count[n-1][n-1]=1;
17
18        for(int i=n-1;i>=0;i--)
19        {
20            for(int j=n-1;j>=0;j--)
21            {
22                if(board.get(i).charAt(j)=='X')
23                    continue;
24
25                if(i==n-1 && j==n-1)
26                    continue;
27
28                int max=-1;
29                int ways=0;
30
31                if(i+1<n && score[i+1][j]!=-1)
32                {
33                    if(score[i+1][j]>max)
34                    {
35                        max=score[i+1][j];
36                        ways=count[i+1][j];
37                    }
38                    else if(score[i+1][j]==max)
39                        ways=(ways+count[i+1][j])%mod;
40                }
41
42                if(j+1<n && score[i][j+1]!=-1)
43                {
44                    if(score[i][j+1]>max)
45                    {
46                        max=score[i][j+1];
47                        ways=count[i][j+1];
48                    }
49                    else if(score[i][j+1]==max)
50                        ways=(ways+count[i][j+1])%mod;
51                }
52
53                if(i+1<n && j+1<n && score[i+1][j+1]!=-1)
54                {
55                    if(score[i+1][j+1]>max)
56                    {
57                        max=score[i+1][j+1];
58                        ways=count[i+1][j+1];
59                    }
60                    else if(score[i+1][j+1]==max)
61                        ways=(ways+count[i+1][j+1])%mod;
62                }
63
64                if(max==-1)
65                    continue;
66
67                int val=0;
68                char ch=board.get(i).charAt(j);
69
70                if(ch!='S' && ch!='E')
71                    val=ch-'0';
72
73                score[i][j]=max+val;
74                count[i][j]=ways;
75            }
76        }
77
78        if(score[0][0]==-1)
79            return new int[]{0,0};
80
81        return new int[]{score[0][0],count[0][0]};
82    }
83}