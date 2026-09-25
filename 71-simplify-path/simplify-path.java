class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String[] parts=path.split("/");
        for(String p:parts){
            if(p.equals("") || p.equals(".")){
                continue;
            }
            else if(p.equals("..")){
                if(!s.isEmpty()){s.pop();}
            }
            else{
                s.push(p);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (String dir : s) {
    sb.append("/");
    sb.append(dir);
}
        if(sb.length()==0){
            return "/";
        }
        return sb.toString();
    }
}