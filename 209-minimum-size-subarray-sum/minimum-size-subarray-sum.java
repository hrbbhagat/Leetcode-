class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum =0;
        int result=Integer.MAX_VALUE;
        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>=target){
                result=Math.min(result,j-i+1);
                sum=sum-nums[i];
                i++;
            }
            j++;
        }
        if(result==Integer.MAX_VALUE){
            return 0;
        }
        return result;
        
    }
}