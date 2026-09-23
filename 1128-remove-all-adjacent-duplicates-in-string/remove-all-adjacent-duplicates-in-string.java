class Solution {
    public String removeDuplicates(String s) {
        StringBuilder result=new StringBuilder();
        int n=s.length();
        Stack <Character> h=new Stack<>();
        for(int i=0;i<n;i++){
            if(h.isEmpty()){
                h.push(s.charAt(i));
                continue;
            }
            if(h.peek()==s.charAt(i)){
                h.pop();
                continue;
            }
            h.push(s.charAt(i));
        }
        while(!h.empty()){
            result.append(h.peek());
            h.pop();
        }
        result.reverse();
        return result.toString();
        
    }
}