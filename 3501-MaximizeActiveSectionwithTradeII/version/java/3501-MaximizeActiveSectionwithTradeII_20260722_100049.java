// Last updated: 7/22/2026, 10:00:49 AM
1
2class SparseTable {
3    int sparse[][]; 
4    SparseTable(int[] nums){
5        int n = nums.length; 
6        sparse = new int[21][n]; 
7
8        // Now we have to create a sparse tables with nums, where nums[i] = sum of zeroBlocks[i] + zeroBlocks[i + 1] 
9
10        // for zero length 
11        for(int i = 0; i < n; i++) {
12            sparse[0][i] = nums[i]; 
13        }
14
15        // for length 2 - 20 
16        for(int base = 1; base <= 20; base++) {
17            for(int i = 0; i < n; i++) {
18
19                int pow2 = 1 << (base - 1); 
20                if(i + pow2 < n) {
21                    sparse[base][i] = Math.max(sparse[base - 1][i], sparse[base - 1][i + pow2]); 
22                } else sparse[base][i] = sparse[base - 1][i]; 
23            }
24        }
25    }
26
27    int query(int l, int r) {
28        if(l > r) return 0; 
29        // return the max in range r to l 
30        int base = 0; 
31        for(; base <= 20; base++) {
32            if((1 << base) > r - l + 1 ) {
33                break; 
34            }
35        }
36        base--; 
37        if(base < 0) return 0;  
38        return Math.max(sparse[base][l], sparse[base][r - (1 << base) + 1]); 
39    }
40}
41
42class SegmentTree {
43    private int n; 
44    private int arr[]; 
45    private int seg[]; 
46
47    SegmentTree(int[] nums){
48        int n = nums.length; 
49        this.n = n; 
50        seg = new int[4 * n]; 
51        this.arr = nums; 
52        build(1, 0, n - 1); 
53    }
54
55    private void build(int node, int l, int r) {
56        if(l == r) {
57            seg[node] = arr[l]; 
58            return; 
59        }
60
61        int mid = (l + r) >> 1; 
62        build(2 * node, l , mid); 
63        build(2 * node + 1, mid + 1, r); 
64        seg[node] = Math.max(seg[2 * node], seg[2 * node + 1]); 
65    }
66
67    int internalQuery(int node, int st, int en, int l, int r) {
68        if(l <= st && en <= r) {
69            // we found the current node 
70            return seg[node]; 
71        }
72        int mid = (st + en) >> 1; 
73        int res = 0; 
74        if(mid >= l) {
75            res = Math.max(res, internalQuery(node * 2, st, mid, l, r)); 
76        }
77
78        if(r > mid) {
79            res = Math.max(res, internalQuery(node * 2 + 1, mid + 1, en, l, r)); 
80        }
81        return res; 
82    }
83
84    int query(int l, int r) {
85        if(l > r) return 0; 
86        return internalQuery(1, 0, n - 1, l, r); 
87    }
88}
89
90class Solution {
91    int seg = 0; 
92    public List<Integer> maxActiveSectionsAfterTrade(String s, int[][] q) {
93        int n = s.length(); 
94        int cnt1 = 0; 
95        for(char c: s.toCharArray()) {
96            if(c == '1') cnt1++; 
97        }
98
99        List<Integer> zeroBlocks = new ArrayList<>(); 
100        List<Integer> zeroLeft = new ArrayList<>(); 
101        List<Integer> zeroRight = new ArrayList<>(); 
102
103        int idx = 0; 
104        while(idx < n) {
105            int r = idx; 
106            while(r < n && s.charAt(idx) == s.charAt(r)) {
107                r++; 
108            }
109            int curBlockLen = r - idx; 
110            if(s.charAt(idx) == '0') {
111                // zero block 
112                zeroBlocks.add(curBlockLen); 
113                zeroLeft.add(idx);
114                zeroRight.add(r - 1); 
115            }
116            idx = r; 
117        }
118
119        // Now zeroLeft, zeroRight - both are sorted 
120        int m = zeroBlocks.size(); 
121        seg = m; 
122        List<Integer> ans = new ArrayList<>(); 
123        // base case 
124        if(m <= 1) {
125            for(int i = 0; i < q.length; i++) ans.add(cnt1); 
126            return ans; 
127        }
128        int nums[] = new int[m - 1]; 
129        // prepar the nums 
130        for( int bl = 0; bl < m - 1; bl++) {
131            nums[bl] = zeroBlocks.get(bl) + zeroBlocks.get(bl + 1); 
132        }
133        // SparseTable sp = new SparseTable(nums); 
134        SegmentTree sp = new SegmentTree(nums); 
135
136        
137        for(int i = 0; i < q.length; i++) {
138            int l = q[i][0], r= q[i][1]; 
139
140            // More than two segments. Now we have to apply the operation in [l...r] 
141            // We have three cases 
142            int l_idx = lowerBound(zeroRight, l); 
143            int r_idx = upperBound(zeroLeft, r) - 1; 
144
145            if(l_idx > m - 1 || r_idx < 0 || l_idx >= r_idx) {
146                // left index can not be last, 
147                // right index can not be first 
148                // both cannot be same or l_idx > r_idx 
149                ans.add(cnt1); 
150                continue; 
151            } 
152
153            // leftMostBlock that falls or overlaps with l 
154            // it means for this zero block zeroLeft[i] < l & zeroRight[i] > l 
155            // for this case contribution = r - max(zeroLeft[i], l) + zeroBlock[i + 1] 
156            int leftLen = zeroRight.get(l_idx) - Math.max(zeroLeft.get(l_idx), l) + 1; 
157
158            // rightMostBlock that falls or verlaps with r means zerLeft[j] < r & zeroRight[j] > r
159            // here contri = min(r, zeroRight[j])  - zeroLeft[j] + zeroBlock[j - 1]
160            int rightLen = Math.min(r, zeroRight.get(r_idx)) - zeroLeft.get(r_idx) + 1; 
161
162            // If there are only two 0 blocks within the substring 
163            if ( l_idx + 1 == r_idx) {
164                int contribution = leftLen + rightLen; 
165                ans.add(cnt1 + contribution); 
166                continue; 
167            }
168
169            // If more than two blocks 
170            // left contribution 
171            int leftContri = leftLen + zeroBlocks.get(l_idx + 1); 
172            int rightContri = rightLen + zeroBlocks.get(r_idx - 1); 
173
174            // Now for all middle one's we have to find the max from the range 
175            // i.e, from (i + 1 ... j - 2 )
176            // This how to find efficiently ?? We can use Segment Tree / or sparse tables 
177            int middleContri = sp.query(l_idx + 1, r_idx - 2); // why r_idx - 2?? If r_idx -1, then it will be count r_idx again ( last pair again).
178            ans.add(cnt1 + Math.max(leftContri, Math.max(rightContri, middleContri)));  
179        }
180        return ans; 
181    }
182
183    private int lowerBound(List<Integer> zeroRight, int l) {
184        int left = 0; 
185        int right = seg; 
186        while(left < right) {
187            int mid = (left + right) >> 1; 
188            if(zeroRight.get(mid) >= l) {
189                right = mid; 
190            } else left = mid + 1; 
191        }
192        return left; 
193    }
194
195    private int upperBound(List<Integer> zeroLeft, int r) {
196        int left = 0, right = seg; 
197        while(left < right) {
198            int mid = (left + right) >> 1; 
199            if(zeroLeft.get(mid) <= r) {
200                left = mid + 1; 
201            } else right = mid; 
202        }
203        return left; 
204    }
205}