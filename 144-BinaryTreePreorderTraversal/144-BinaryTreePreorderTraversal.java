// Last updated: 2/10/2026, 3:18:47 PM
class Solution{
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<Integer>();
        helper(root, result);
        return result;
    }

    public void helper(TreeNode root, List<Integer> result){
        if(root != null){
            result.add(root.val);
            helper(root.left,  result);
            helper(root.right, result);
        }
    }
}