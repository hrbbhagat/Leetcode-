class Solution {
    public void nextPermutation(int[] nums) {
//         // int i=0;
//         int j=nums.length;
        
//         for(int i=nums.lenght-1;i>=0;i--){

//             if(nums[j]>nums[i+1]){
//             int temp=nums[i+1];
//             nums[i+1]=nums[j];
//             nums[j]=temp;
//             }
//             else{
//                 // int temp=0;
//                 int temp=nums[j];
//                 nums[j]=nums[i];
//                 nums[i]=temp;
//             }
            
            
            
//         }
        
//     }
// }
 int n = nums.length;

        // Step 1: Find the pivot
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: Find the next greater element from the right
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Step 3: Swap pivot and next greater
            swap(nums, i, j);
        }

        // Step 4: Reverse the suffix
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}