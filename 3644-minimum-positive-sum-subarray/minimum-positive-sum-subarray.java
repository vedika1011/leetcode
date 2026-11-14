class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int sum=0;
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            sum=0;
            for(int j=i;j < Math.min(nums.size(), i + r);j++){
                int len=j-i+1;
                sum+=nums.get(j);
                if(l<=len && len<=r && sum>0){
                    minSum=Math.min(sum,minSum);
                }
            
            }
        }
        if(minSum==Integer.MAX_VALUE){
        return -1;
        }
        return minSum;
    }
}