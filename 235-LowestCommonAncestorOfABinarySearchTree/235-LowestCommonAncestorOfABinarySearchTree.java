// Last updated: 2/10/2026, 3:17:59 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;
        int pVal = p.val;
        int qVal = q.val;
        if(pVal > parentVal && qVal > parentVal){
            return lowestCommonAncestor(root.right, p, q);
        } 
        if(pVal < parentVal && qVal < parentVal){
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}