class Solution {
    public int maxProduct(int[] nums) {
        int minending=1;
        int maxending=1;
        int result=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]*minending;
            int v3=nums[i]*maxending;

            maxending=Math.max(v1, Math.max(v2,v3));
            minending=Math.min(v1, Math.min(v2,v3));
            result=Math.max(result, Math.max(minending,maxending));

        }
        return result;

        
    }
}