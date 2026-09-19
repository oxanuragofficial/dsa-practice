class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ans=new Stack<>();

        for(int i=0; i<tokens.length; i++){
            String s=tokens[i];
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int op=op(s);
                int a = ans.pop();
                int b = ans.pop();
                
                int res=0;
                if(op==45){
                    res=b-a;

                }
                else if(op==43){
                     res=b+a;
                }
                else if(op==42){
                     res=b*a;
                }
                else if(op==47){
                     res=b/a;
                }
                ans.push(res);


            }
            else{
                ans.push(Integer.parseInt(s));
            }
        }
       return ans.pop();
    }

    public int op(String c){

      return c.charAt(0);
    }
}