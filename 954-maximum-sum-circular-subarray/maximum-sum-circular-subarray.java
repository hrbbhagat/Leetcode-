class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum=0;
        int minsum=0;
        int result=Integer.MIN_VALUE;
        int res=Integer.MAX_VALUE;
        int totalsum=0;

        int finalresult=Integer.MIN_VALUE;

        

        //case1 ---> max sum of the subarray 
        
        for(int i=0;i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]+maxsum;

            maxsum=Math.max(v1,v2);
            result=Math.max(result,maxsum);


        }
        //totalsum of the array

         for(int i=0;i<nums.length;i++){
              totalsum=totalsum+nums[i];

        }

        //case2 -----> min sum of the subarray 


       

        for(int i=0;i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]+minsum;

            minsum=Math.min(v1,v2);
            res=Math.min(minsum,res);
        }

        int A =result;
      
        if(result<0){
            return result;
        }
        int B = totalsum-res;
        
        finalresult=Math.max(A,B);

        return finalresult;


        
        
    
        
    }
}