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
    public boolean isUnivalTree(TreeNode root) {
       if(root==null){
        return true;
       }
       
       return check(root,root.val);
    }
    public boolean check(TreeNode root, int value){
        if(root==null){
        return true;
       }
        if(root.val!=value){return false;}
        return check(root.left,value)&& check(root.right,value);
    }
}