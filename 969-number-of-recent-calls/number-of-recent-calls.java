class RecentCounter {
    Queue<Integer> q=new ArrayDeque<>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        q.offer(t); //add t to the queue
        int req=t-3000;
        while(q.peek()<req){
            q.poll();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */