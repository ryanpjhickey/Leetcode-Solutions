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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> tList = new ArrayList<Integer>();

        Stack<TreeNode> tStack = new Stack<TreeNode>();
        TreeNode currentTNode = root;

        while(currentTNode!=null || !tStack.empty()){
            while(currentTNode!=null){
                tStack.add(currentTNode);
                currentTNode = currentTNode.left;
            }
            currentTNode = tStack.pop();
            tList.add(currentTNode.val);
            currentTNode = currentTNode.right;
        }

        return tList;
    }
}