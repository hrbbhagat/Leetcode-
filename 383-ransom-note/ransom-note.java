class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer>ransommap=new HashMap<>();
        HashMap<Character, Integer>magazinemap=new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            ransommap.put(ch, ransommap.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            magazinemap.put(ch, magazinemap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> keys = new ArrayList<>(ransommap.keySet());
        for (int i = 0; i < keys.size(); i++) {
            Character ch = keys.get(i);

            int required = ransommap.get(ch);
            int available = magazinemap.getOrDefault(ch, 0);

            if (available < required) {
                return false;
            }
        }    
        return true;

    }
}