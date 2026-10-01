class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        boolean isvalid=false;
        if(s.length()!=t.length()){
            isvalid=false;
            return isvalid;
        }
        HashMap<Character, Integer>hm=new HashMap<>();
        HashMap<Character, Integer >ht=new HashMap<>();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        
        }
        for(int i=0;i<t.length();i++){
            char ct=t.charAt(i);
            ht.put(ct, ht.getOrDefault(ct,0)+1);
        }
        if(hm.equals(ht)){
            isvalid = true;
        }
       
        return isvalid;
    }
}