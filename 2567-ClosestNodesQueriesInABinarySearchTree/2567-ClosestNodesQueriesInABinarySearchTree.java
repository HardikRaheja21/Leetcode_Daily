// Last updated: 2/13/2026, 7:22:56 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> inOrder = new ArrayList<>();
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        inOrderTraversal(root);
        List<List<Integer>> ans = new ArrayList<>();
        for(int q : queries){
            ans.add(findClosest(q));
        }
        return ans;
    }
    public void inOrderTraversal(TreeNode root){
        if(root == null) return;
        inOrderTraversal(root.left);
        inOrder.add(root.val);
        inOrderTraversal(root.right);
    }
    public List<Integer> findClosest(int q){
        int n = inOrder.size();
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(inOrder.get(mid) == q){
                return Arrays.asList(q, q);
            } else if(inOrder.get(mid) < q){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        int minVal = (right >= 0) ? inOrder.get(right) : -1;
        int maxVal = (left < n) ? inOrder.get(left) : -1;

        return Arrays.asList(minVal, maxVal); 
    }
}