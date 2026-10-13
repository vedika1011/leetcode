class Solution {
    public long maxAlternatingSum(int[] nums) {
        // Arrays.sort(nums);
        // long ans=0;
        // for(int i=0; i<nums.length;i++){
        //     long x=nums[nums.length-1-i];
        //     long sq=x*x;
        //     if(i%2==0){
        //     ans+=sq;
        //     }
        //     else{
        //         ans-=sq;
        //     }
        
        // }
        long[] squares=new long[nums.length];
        for(int i=0; i<nums.length;i++){
            squares[i]=(long) nums[i]*nums[i];
        }
        Arrays.sort(squares);
        long ans=0;
        int mid=nums.length/2;
        for(int j=0;j<mid;j++){
            ans-=squares[j];
        }
        for(int k=mid;k<nums.length;k++){
            ans+=squares[k];
        }
        return ans;
    }
}
//nums[0]**2-nums[1]**2+nums[2]**2-nums[3]**2
//to maximize this need small no in subtracting pos