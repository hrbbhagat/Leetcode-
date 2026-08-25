class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> hm=new ArrayList<>();
        // int multiple=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]%k==0){
                hm.add(nums[i]);


            }
        }
            
        int multiple=k;
        while(hm.contains(multiple)){
            multiple=multiple+k;
        }

        
        return multiple;
        
    }
}