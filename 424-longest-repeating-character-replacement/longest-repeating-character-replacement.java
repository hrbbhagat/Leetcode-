class Solution {
    public int characterReplacement(String s, int k) {
        int low =0;
        int high = 0;
        int n=s.length();
        int result=0;
        int maxfreq=0;
        HashMap<Character, Integer> hm=new HashMap<>();
        for(high=0; high<n;high++){
            char ch =s.charAt(high);
            hm.put(ch,hm.getOrDefault(ch,0)+1);

            maxfreq = Math.max(maxfreq, hm.get(ch));
        
            while((high-low+1)-maxfreq > k){
                char leftchar =s.charAt(low);
                hm.put(leftchar,hm.get(leftchar)-1);

                if (hm.get(leftchar)==0){
                    hm.remove(leftchar);
                }
                low++;
            }
            result = Math.max(result,high-low+1);


        }
        return result;
        
    }
}