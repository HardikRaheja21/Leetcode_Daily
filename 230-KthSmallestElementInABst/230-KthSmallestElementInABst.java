// Last updated: 2/10/2026, 3:18:04 PM
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
    public ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return arr;
        inOrder(root.left, arr);
        arr.add(root.val);
        inOrder(root.right, arr);
        return arr;
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans = inOrder(root, new ArrayList<Integer>());
        return ans.get(k - 1);
    }
}