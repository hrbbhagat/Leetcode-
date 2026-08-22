class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;

        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]== target){
                first =mid;
                j=mid-1;
            
            }
            else if(target>nums[mid]){
                i=mid+1;

            }
            else{
                j=mid-1;
            }
        }

        i=0;
        j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]== target){
                last =mid;
                i=mid+1;
            
            }
            else if(target>nums[mid]){
                i=mid+1;

            }
            else{
                j=mid-1;
            }
        }



        return new int []{first , last};
    
        
        
    }
}

