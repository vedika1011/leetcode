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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        func(root,targetSum,path,res);
        return res;
    }
    private void func(TreeNode root, int rem, List<Integer> path, List<List<Integer>> res){
        if(root==null){
            return;
        }
        path.add(root.val);
        rem-=root.val;
        if(root.left==null && root.right==null){
            if(rem==0){
                res.add(new ArrayList<>(path));
            }
        }
         else{
                func(root.left,rem,path,res);
                func(root.right,rem,path,res);
            }
        
        path.remove(path.size()-1);
    }

}