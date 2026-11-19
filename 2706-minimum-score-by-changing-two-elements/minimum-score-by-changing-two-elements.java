class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=3){
            return 0;
        }
        int n=nums.length;
        int a=nums[n-1]-nums[2]; //two smallest
        int b = nums[n-2] - nums[1]; //smallest and largest
        int c = nums[n-3] - nums[0]; //two largest
        return Math.min(a,Math.min(b,c));
    }
}