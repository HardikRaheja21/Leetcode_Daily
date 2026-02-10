// Last updated: 2/10/2026, 3:17:42 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
   public void recSerialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        recSerialize(root.left, sb);
        recSerialize(root.right, sb);
    }

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        recSerialize(root, sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
   public TreeNode recDeserialize(Queue<String> q) {
        String val = q.poll();
        if (val.equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = recDeserialize(q);
        root.right = recDeserialize(q);
        return root;
    }

    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));
        return recDeserialize(q);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));