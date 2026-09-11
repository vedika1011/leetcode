class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int length=temperatures.length;
        // int[] answer=new int[length];
        // for(int i=0; i<temperatures.length;i++){
        //     for(int j=i+1;j<temperatures.length;j++){
        //     if(temperatures[i]<temperatures[j]){
        //         answer[i]=j-i;
        //                 break; 
        //     }
     
        //     }
 
        // }
        // return answer; brute force
        Stack<Integer> s=new Stack<>();
        int n=temperatures.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int old=s.pop();
                ans[old]=i-old;
                
            }
            s.push(i);
        }
        return ans;
    }
}