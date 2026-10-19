class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);
        // List<Integer> ans=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         ans.add(i);
        //     }
        // }
        // return ans;

        int lessCount=0;
        int count=0;
        for(int n: nums){
            if(n<target){
                lessCount++;
            }
            else if(n==target){
                count++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<count;i++){
            ans.add(lessCount+i);
        }
        return ans;
    }
}