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
 //level order traversal
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int level=1;
        int ans=1;
        int maxSum=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                sum+=curr.val;
                if(curr.left!=null){
                    q.offer(curr.left);
                } 
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
                if(sum>maxSum){
                    maxSum=sum;
                    ans=level;
                }
                level++;
        }
        return ans;
    }
}