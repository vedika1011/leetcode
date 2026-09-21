class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String element : tokens){
            try{
                int n=Integer.parseInt(element);
                stack.push(n);
            } catch(NumberFormatException e){
                int b=stack.pop();
                int a=stack.pop();
                if(element.equals("+")){
                    stack.push(a+b);
                }
                else if(element.equals("-")){
                    stack.push(a-b);
                }
                else if(element.equals("*")){
                    stack.push(a*b);
                }else{
                    stack.push(a/b);
                }
            }
        }
        return stack.pop();
    }
}