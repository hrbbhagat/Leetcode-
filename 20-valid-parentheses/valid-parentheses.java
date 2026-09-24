class Solution {
    public boolean isValid(String s) {
        Stack <Character> h=new Stack<>();
        //boolean isvalid=false;
        int n=s.length();
        for(int i =0;i<n;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                h.push(s.charAt(i));
                continue;
            }

            if(h.isEmpty()){
                return false;
            }

            if(s.charAt(i)==')'&& h.peek()=='('){
                h.pop();
            }
            else if(s.charAt(i)=='}'&& h.peek()=='{'){
                h.pop();
            }
           else if(s.charAt(i)==']'&& h.peek()=='['){
                h.pop();
            }
            else {
                return false;
            }

            

            

        }

        if(!h.isEmpty()){
            return false;
        }
        else{
            return true;
        }
        
    }
}