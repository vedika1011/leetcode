class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int n: nums){
            pq.offer(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}