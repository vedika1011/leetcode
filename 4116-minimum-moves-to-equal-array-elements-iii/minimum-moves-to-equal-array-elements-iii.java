class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int sum=0;
        for(int j=0;j<n;j++){
            sum=sum+nums[j];
        }
        return (max*n)-sum;
    }
}