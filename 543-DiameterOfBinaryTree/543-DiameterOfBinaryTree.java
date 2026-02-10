// Last updated: 2/10/2026, 3:16:47 PM
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
    int maxDiameter = 0;
    public int getHeight(TreeNode root){
        if(root == null) return 0;
        int leftheight = getHeight(root.left);
        int rightheight = getHeight(root.right);
        maxDiameter = Math.max(maxDiameter, leftheight + rightheight);
        return 1 + Math.max(rightheight, leftheight);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return maxDiameter;
    }
}