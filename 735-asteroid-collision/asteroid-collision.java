class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int curr=asteroids[i];
                    boolean alive=true;
            while(!s.isEmpty() && s.peek()>0 && curr<0){
                if(Math.abs(s.peek())<Math.abs(curr)){
                    s.pop();
                }
                else if(Math.abs(s.peek())==Math.abs(curr)){
                    s.pop();
                    alive=false;
                    break;
                }
                else{
                    alive=false;
                    break;
                }
            }
            if(alive){
            s.push(curr);
        } }
        int[] res=new int[s.size()];
        for(int i=res.length-1; i>=0;i--){
            res[i]=s.pop();
        }
    
        return res;
        
    }
}