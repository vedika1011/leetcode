class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='*'){
                stack.push(ch);
            }
            else{
                stack.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            char ans=stack.pop();
            sb.append(ans);
        }
        return sb.reverse().toString();
    }
}