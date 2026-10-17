class Solution {
    public int minSwaps(int[] nums) {
        int size=nums.length;
        int[][] arr=new int[size][3];

        for(int i=0;i<size;i++){
            int sum=digitsum(nums[i]);
            arr[i][0]=sum;
            arr[i][1]=nums[i];
            arr[i][2]=i;
        }
        
        Arrays.sort(arr, (a,b)->{
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
        boolean[] visited=new boolean[size];
        int swaps=0;
        for(int j=0;j<size;j++){
            if(visited[j] || arr[j][2]==j){
                continue;
            }
            int len=0;
            int k=j;
            while(!visited[k]){
                visited[k]=true;
                k=arr[k][2];
                len++;
            }
            swaps+=len-1;
        }
        return swaps;


    }
    public int digitsum(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}