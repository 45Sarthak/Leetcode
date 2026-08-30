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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {

        diameterOfBinaryTree1(root);
        return max;

    }

    public int diameterOfBinaryTree1(TreeNode root){
        if(root==null){
            return 0;
        }

        int left=diameterOfBinaryTree1(root.left);
        int right=diameterOfBinaryTree1(root.right);

        max=Math.max(max,right+left);

        return 1+ Math.max(left,right);
    }
}