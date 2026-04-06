// Last updated: 4/6/2026, 7:51:25 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public void markParents(TreeNode root, Map<TreeNode, TreeNode> parentTrack, TreeNode target){
12        Queue<TreeNode> q = new LinkedList<TreeNode>();
13        q.offer(root);
14        while(!q.isEmpty()){
15            TreeNode curr = q.poll();
16            if(curr.left != null){
17                parentTrack.put(curr.left, curr);
18                q.offer(curr.left);
19            }
20            if(curr.right != null){
21                parentTrack.put(curr.right, curr);
22                q.offer(curr.right);
23            }
24        }
25    }
26    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
27        Map<TreeNode, TreeNode> parentTrack = new HashMap<>();
28        markParents(root, parentTrack, target);
29        Map<TreeNode, Boolean> visited = new HashMap<>();
30        Queue<TreeNode> q = new LinkedList<>();
31        q.offer(target);
32        visited.put(target, true);
33        int curr_level = 0;
34        while(!q.isEmpty()){
35            int size = q.size();
36            if(curr_level == k) break;
37            curr_level++;
38            for(int i = 0; i < size; i++){
39                TreeNode curr = q.poll();
40                if(curr.left != null && visited.get(curr.left) == null){
41                    q.offer(curr.left);
42                    visited.put(curr.left, true);
43                }
44                if(curr.right != null && visited.get(curr.right) == null){
45                    q.offer(curr.right);
46                    visited.put(curr.right, true);
47                }
48                if(parentTrack.get(curr) != null && visited.get(parentTrack.get(curr)) == null){
49                    q.offer(parentTrack.get(curr));
50                    visited.put(parentTrack.get(curr), true);
51                }
52            }
53        }
54        List<Integer> res = new ArrayList<>();
55        while(!q.isEmpty()){
56            TreeNode curr = q.poll();
57            res.add(curr.val);
58        }
59        return res;
60    }
61}