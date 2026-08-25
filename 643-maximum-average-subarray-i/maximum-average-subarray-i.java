class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int high=k-1;
        double result=Integer.MIN_VALUE;
        double average=0;
        double sum=0;

        for(int i=low;i<=high;i++){
            sum=sum+nums[i];
            average= sum/k;
        }

        while(high<nums.length){
            
            result=Math.max(sum,result);
            low++;
            high++;

            if(high==nums.length){
                break;
            }
            sum=sum-nums[low-1];
            sum=sum+nums[high];
            // average=sum/k;

            
        }
        return result/k;
    }
}