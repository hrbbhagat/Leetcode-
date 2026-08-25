class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int result=Integer.MIN_VALUE;
        int res=Integer.MAX_VALUE;
        int minending=0;
        int maxending=0;
        for(int i=0;i<nums.length;i++){
            int v1=nums[i];
            int v2=maxending+nums[i];
            maxending=Math.max(v1,v2);
            result=Math.max(result,maxending);

        }

        for(int i=0;i<nums.length;i++){
            int v4= nums[i];
            int v3=minending+nums[i];
            minending=Math.min(v4,v3);
            res=Math.min(res, minending);
        }

        //int abs= Math.abs(result);
        int sbs=Math.abs(res);
        int finalresult = Math.max(sbs, result);
        return finalresult;
        
    }
}