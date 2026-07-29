// class Solution {
//     public int maxSubArray(int[] nums) {
//         int currsum=0;
//         long maxsum = Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             currsum=0;
//             for(int j=i;j<nums.length; j++){
//                 currsum=currsum+nums[j];
                

            
                
//             if(maxsum<currsum){
//                 maxsum=currsum;
//             }
//         }
//     }
//        return (int)maxsum;
        
// }  
// }
class Solution {

    public int maxSubArray(int[] nums) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            currSum += nums[i];

            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
}