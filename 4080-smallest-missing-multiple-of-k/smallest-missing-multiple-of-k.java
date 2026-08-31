class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        // int multiple=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]%k==0){
                hm.put(nums[i],1);


            }
        }
            
        int multiple=k;
        while(hm.containsKey(multiple)){
            multiple=multiple+k;
        }

        
        return multiple;
        
    }
}