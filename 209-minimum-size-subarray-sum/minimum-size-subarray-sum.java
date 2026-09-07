class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int result =Integer.MAX_VALUE;
        int high =0;
        int low=0;
        int sum=0;
        while(high<nums.length){
            sum=sum+nums[high];
            while(sum>=target){
                int length=high-low+1;
                result=Math.min(length,result);
                sum=sum-nums[low];
                low++;
            }
            high++;
        }
        if(result==Integer.MAX_VALUE){
            return 0;
        }
        return result;
    



        
    }
}