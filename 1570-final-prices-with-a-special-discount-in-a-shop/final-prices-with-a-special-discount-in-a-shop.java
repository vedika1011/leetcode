class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[] answer=new int[n];
        for(int i=0;i<n;i++){
            answer[i]=prices[i];
            int j=i+1;
            while(j<n){
            if(prices[j]<=prices[i]){
                answer[i]=prices[i]-prices[j];
                break;
            }
            j++;
            }
        }
        return answer;
    }
}