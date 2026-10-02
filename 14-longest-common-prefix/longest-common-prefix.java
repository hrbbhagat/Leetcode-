class Solution {
    public String longestCommonPrefix(String[] strs) {
        //int n =strs.length();
        //HashMap<Character, Integer>hm=new HashMap<>();
        String st="";

        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if (strs[i].length()<minimum){
                minimum=strs[i].length();
            }
        }


        for(int i=0;i< minimum;i++){
            for(int j=1;j<strs.length;j++){
                //st = st + strs[0].charAt(i);
              
                if(strs[j].charAt(i)!= strs[0].charAt(i)){
                    return st ;
                }

            }
            st = st + strs[0].charAt(i);
        }

        return st;

        
    }
}