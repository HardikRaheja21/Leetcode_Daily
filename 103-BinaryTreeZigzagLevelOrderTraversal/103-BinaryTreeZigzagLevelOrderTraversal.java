// Last updated: 2/10/2026, 3:19:13 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) return results;

        LinkedList<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.addLast(root);
        nodeQueue.addLast(null); // level marker

        LinkedList<Integer> level_list = new LinkedList<>();
        boolean is_order_left = true;

        while (!nodeQueue.isEmpty()) {
            TreeNode curr_node = nodeQueue.pollFirst();

            if (curr_node != null) {
                if (is_order_left) {
                    level_list.addLast(curr_node.val);
                } else {
                    level_list.addFirst(curr_node.val);
                }

                if (curr_node.left != null) {
                    nodeQueue.addLast(curr_node.left);
                }
                if (curr_node.right != null) {
                    nodeQueue.addLast(curr_node.right);
                }
            } else {
                results.add(level_list);
                level_list = new LinkedList<>();

                if (!nodeQueue.isEmpty()) {
                    nodeQueue.addLast(null);
                }
                is_order_left = !is_order_left;
            }
        }
        return results;
    }
}