class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        //pq of size k, min heap, insert eleements one by one, if pq.size>k, remove one element
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b) -> map.get(a)-map.get(b)
        ); //map.get(a)-map.get(b) gets values and subtracts it which automatically decides the priority of that element, as its min heap, it'll go at the top

        //iterate through the key set 
        for(int num:map.keySet()){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=0;i<k;i++){
            int element=pq.poll();
            ans[i]=element;
        }
        return ans;

    }
}