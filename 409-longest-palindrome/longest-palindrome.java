class Solution {
    public int longestPalindrome(String s) {
        int n= s.length();
        int result=0;
        HashMap<Character, Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0)+1);

        }
        // for(int i=0;i<hm.size();i++){
        //     char ch=s.charAt(i);
        //     if(hm.get(ch)%2==0){
        //         result=result+ hm.get(ch);

        //     }
        //     else{
        //         int res= hm.get(ch)/2;
        //         result=result+res+1;
        //     }
        // }
        boolean oddFound = false;

        ArrayList<Character> keys = new ArrayList<>(hm.keySet());

        for (int i = 0; i < keys.size(); i++) {
            

            Character ch = keys.get(i);
            

            int frequency = hm.get(ch);

            if (frequency % 2 == 0) {
                
                result = result + frequency;
            }
            else {
            result = result + (frequency - 1);

            if (!oddFound) {
                
                result++;
                oddFound = true;
            }
        }
    }
        


        return result;
    }
}