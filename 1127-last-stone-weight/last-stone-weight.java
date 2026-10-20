class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:stones){
            pq.offer(n);
        }
        while(pq.size()>=2){
        int first=pq.poll();
        int second=pq.poll();
        if(first!=second){
            pq.offer(first-second);
        }
        }
        return pq.isEmpty() ? 0 : pq.peek();


    }
}