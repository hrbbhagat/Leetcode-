class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int result=Integer.MIN_VALUE;
        int bestending=0;
        for(int i =0;i<n;i++){
            int v1=nums[i]+bestending;
            int v2=nums[i];
            bestending=Math.max(v1,v2);
            result=Math.max(bestending, result);
        }
        return result;

        
    }
}