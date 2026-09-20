class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int[] ans=new int[nums.length];
       Stack<Integer> stack=new Stack<>();
       for(int i=2*nums.length-1; i>=0;i--){ //scan from right to left twice
        // int index=i%nums.length; //indexes for circular array
        while(!stack.isEmpty() && stack.peek()<=nums[i%nums.length]){
            stack.pop();
        }
        if(stack.isEmpty()){
            ans[i%nums.length]=-1;
        }
        else{
            ans[i%nums.length]=stack.peek();
        }
        stack.push(nums[i%nums.length]);

       } 
       return ans;
    }
}