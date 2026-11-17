class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int maxCount=0;
        for(int i=0;i<k;i++){
            char temp=s.charAt(i);
            if(temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u'){
                count++;
            }
        }
        maxCount=count;
        for(int j=k;j<s.length();j++){
            char out=s.charAt(j-k);
            char in=s.charAt(j);
            if(out=='a' || out=='e' || out=='i' || out=='o' || out=='u'){
                count--;
            }
            if(in=='a' || in=='e' || in=='i' || in=='o' || in=='u'){
                count++;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;

    }
}