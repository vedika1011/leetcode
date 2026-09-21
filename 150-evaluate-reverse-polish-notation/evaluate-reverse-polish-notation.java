class Solution {
    public int evalRPN(String[] tokens) {
        // 8ms
        // Stack<Integer> stack=new Stack<>();
        // for(String element : tokens){
        //     try{
        //         int n=Integer.parseInt(element);
        //         stack.push(n);
        //     } catch(NumberFormatException e){
        //         int b=stack.pop();
        //         int a=stack.pop();
        //         switch(element){
        //             case "+":stack.push(a+b); break;
        //             case "-":stack.push(a-b); break;
        //             case "*":stack.push(a*b);break;
        //             case "/":stack.push(a/b);break;
        //         }
        //     }
        // }
        // return stack.pop();

        Stack<Integer> stack=new Stack<>();
        for(String c:tokens){
            if(c.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(c.equals("-")){
                int b=stack.pop();
                int a =stack.pop();
                stack.push(a-b);
            }
            else if(c.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(c.equals("/")){
                int den=stack.pop();
                int num=stack.pop();
                stack.push(num/den);
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}