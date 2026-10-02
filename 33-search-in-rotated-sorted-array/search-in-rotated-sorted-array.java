class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int required=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                required=i;
                break;
            }
            else{
                required=-1;
            }
            
        }
        return required;
        
    }
}