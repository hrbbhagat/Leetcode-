class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int high=0;
        int n=s.length();
        int result=0;

        // int k =high-low+1;

        HashMap<Character ,Integer> hm=new HashMap<>();

        for(high=0;high<n;high++){
            char ch =s.charAt(high);
            hm.put(ch,hm.getOrDefault(ch,0)+1);

            while(hm.get(ch)>1){
                char leftchar =s.charAt(low);
                hm.put(leftchar, hm.get(leftchar)-1);

                if(hm.get(leftchar)==0){
                    hm.remove(leftchar);
                }
                low++;
                // int k=high-low+1;

            }
            result =Math.max(result, high-low+1);
        

        }
        return result;
        
    }
}