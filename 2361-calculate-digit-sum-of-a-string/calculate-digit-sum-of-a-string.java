class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k){
            return s;
        }
        StringBuilder sb=new StringBuilder();
        //divide into grps of k
        for(int i=0;i<s.length();i+=k){
            int sum=0;
            //calculate sum of digits in every grp
            for(int j=i;j<Math.min(i+k,s.length());j++){ //i+k to move to the next grp
                sum+=s.charAt(j)-'0';
            }
            sb.append(sum);
        }
        return digitSum(sb.toString(),k);

    }
}