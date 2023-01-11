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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> tArray = new ArrayList<Integer>();
        Stack<TreeNode> tStack = new Stack<TreeNode>();
        
        if (root == null) {
            return tArray;
        }

        tStack.push(root);
        while (!tStack.isEmpty()){
            TreeNode node = tStack.pop();
            tArray.add(node.val);
            if (node.right != null) tStack.push(node.right);
            if (node.left != null) tStack.push(node.left);
        }
        return tArray;
    }
}