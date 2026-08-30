class Solution {
    public int minimumDeletions(int[] nums) {
        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;
        int maximumIndex =0;
        int minimumIndex=0;
        
        for(int i=0;i<nums.length;i++){
            if(maximum<nums[i]){
                maximum=nums[i];
                maximumIndex=i;
            }

        }
        for(int i=0;i<nums.length;i++){
            if(minimum>nums[i]){
                minimum=nums[i];
                minimumIndex=i;
            }
        }

        int left = Math.min(minimumIndex, maximumIndex);
        int right = Math.max(minimumIndex, maximumIndex);

        int front =right+1;
        int back=nums.length-left;
        int both= (left+1)+(nums.length-right);
        int result=Math.min(both,Math.min(front,back));
        return result;


    }
}