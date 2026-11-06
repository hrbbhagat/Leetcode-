class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hm=new HashMap<>();
        hm.put('b', 1);
        hm.put('a', 1);
        hm.put('l',2);
        hm.put('o',2);
        hm.put('n',1);
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);

        }
        int min=Integer.MAX_VALUE;
        ArrayList<Character> keys=new ArrayList<>(hm.keySet());
        for(int i=0;i<keys.size();i++){
            Character ch =keys.get(i);
            int required= hm.get(ch);
            int available=map.getOrDefault(ch,0);

            int possible=available/required;
            min=Math.min(min, possible); 


        }
        return min;
    }
}